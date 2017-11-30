package api;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.google.gson.Gson;

import exceptions.AccessDeniedException;
import exceptions.InvalidParameterException;
import exceptions.MissingAuthException;
import exceptions.NotFoundOrAvailableException;
import model.customers.Customers;

public class HttpApi {
	
	final String endpoint = "sandbox.billogram.com/api/v2";
	final CloseableHttpClient auth(){
		CredentialsProvider provider = new BasicCredentialsProvider();
		UsernamePasswordCredentials creds = new UsernamePasswordCredentials("9882-FuolGEPZ", "c3306e6ec144f313f63b428a43030971");
		provider.setCredentials(AuthScope.ANY, creds);
		CloseableHttpClient httpclient = HttpClientBuilder.create().setDefaultCredentialsProvider(provider).build();
		
		return httpclient;
	}
	protected CloseableHttpResponse httpGet(URIBuilder builder) throws URISyntaxException, ClientProtocolException, IOException{
		CloseableHttpClient httpclient = this.auth();
		URI uri = builder.build();
		HttpGet httpget = new HttpGet(uri);
		CloseableHttpResponse response = httpclient.execute(httpget);
		
		return response;
	}
	
	protected CloseableHttpResponse httpPost(URIBuilder builder, Object obj) throws URISyntaxException, ClientProtocolException, IOException{
		Gson gson = new Gson();
	    String modelAsString = gson.toJson(obj);
	    System.out.println(modelAsString);
		CloseableHttpClient httpclient = this.auth();
		URI uri = builder.build();
		HttpPost httpPost = new HttpPost(uri);
		StringEntity entity = new StringEntity(modelAsString, HTTP.UTF_8);
	    httpPost.setEntity(entity);
	    CloseableHttpResponse response = httpclient.execute(httpPost);
		
		return response;
	}
	
	protected CloseableHttpResponse httpPut(URIBuilder builder, Object obj) throws URISyntaxException, ClientProtocolException, IOException{
		Gson gson = new Gson();
	    String modelAsString = gson.toJson(obj);
		CloseableHttpClient httpclient = this.auth();
		URI uri = builder.build();
		HttpPut httpPut = new HttpPut(uri);
		StringEntity entity = new StringEntity(modelAsString, HTTP.UTF_8);
	    httpPut.setEntity(entity);
	    CloseableHttpResponse response = httpclient.execute(httpPut);
		
		return response;	
	}
	
	

	protected void handelErrors(CloseableHttpResponse response) throws ParseException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		String bodyAsString = EntityUtils.toString(response.getEntity(),"UTF-8");
		JSONObject jsonObject = new JSONObject(bodyAsString.toString());
		switch (response.getStatusLine().getStatusCode()){
		case 400 :
			throw new InvalidParameterException(jsonObject);
		case 401:
			throw new MissingAuthException(jsonObject);
		case 403:
			throw new AccessDeniedException(jsonObject);
		default:
			throw new NotFoundOrAvailableException(jsonObject);
			}
	}

}
