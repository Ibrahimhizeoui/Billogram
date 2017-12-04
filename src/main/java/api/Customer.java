package api;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import exceptions.AccessDeniedException;
import exceptions.InvalidParameterException;
import exceptions.MissingAuthException;
import exceptions.NotFoundOrAvailableException;
import model.customers.Customers;

public class Customer extends HttpApi{

	public CloseableHttpResponse search() throws ClientProtocolException, URISyntaxException, IOException, ParseException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/customer")
		    .setParameter("page", "1")
		    .setParameter("page_size", "100");
		CloseableHttpResponse response = this.httpGet(queryParameters);
		
		return response;
	}
	
	public CloseableHttpResponse find(int id) throws ClientProtocolException, URISyntaxException, IOException, ParseException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/customer/"+id)
		    .setParameter("page", "1")
		    .setParameter("page_size", "100");
		CloseableHttpResponse response = this.httpGet(queryParameters);
		
		return response;
	}
	
	public CloseableHttpResponse post(Customers customer) throws ClientProtocolException, URISyntaxException, IOException, ParseException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/customer");
		CloseableHttpResponse response = this.httpPost(queryParameters, customer);
		
		return response;
	}
	
	public CloseableHttpResponse put(String id, Customers customer) throws ClientProtocolException, URISyntaxException, IOException, ParseException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/customer/"+id);
		System.out.println(queryParameters);
		CloseableHttpResponse response = this.httpPut(queryParameters, customer);
		
		return response;
	}
	
	protected Customers handelResponseForOneObect(CloseableHttpResponse response) throws ParseException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		Customers customer = null;
		if(! (response.getStatusLine().getStatusCode()==200)){
			this.handelErrors(response);
			return null;
		}
			String bodyAsString = EntityUtils.toString(response.getEntity());
			//get data from boby
			JSONObject jsonObject = new JSONObject(bodyAsString.toString());
			//Convert json to customers
			GsonBuilder gsonBuilder = new GsonBuilder();
			Gson gson = gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer()).create();
			customer = gson.fromJson(jsonObject.get("data").toString(), Customers.class);
		
		return customer;	
	}
	
	private List<Customers> handelResponseForArrayObject(CloseableHttpResponse response) throws ParseException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		Customers[] customers = null;
		List<Customers> listOfCostomers = new ArrayList<Customers>();
		if(response.getStatusLine().getStatusCode()==200){
			String bodyAsString = EntityUtils.toString(response.getEntity());
			//get data from boby
			JSONObject jsonObject = new JSONObject(bodyAsString.toString());
			//Convert json to customers[]
			GsonBuilder gsonBuilder = new GsonBuilder();
			Gson gson = gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer()).create();
			customers = gson.fromJson(jsonObject.get("data").toString(), Customers[].class);
			for (Customers customer :customers){
				listOfCostomers.add(customer);
				}
			}
		else{
			this.handelErrors(response);
			return null;
		}
		return listOfCostomers;
	}
	
	
}
