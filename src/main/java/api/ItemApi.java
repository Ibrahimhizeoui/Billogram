package api;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.google.gson.Gson;

import exceptions.AccessDeniedException;
import exceptions.InvalidParameterException;
import exceptions.MissingAuthException;
import exceptions.NotFoundOrAvailableException;
import model.customers.Customers;
import model.item.BaseItem;

public class ItemApi extends HttpApi implements HandelResponse<BaseItem>{
	
	public CloseableHttpResponse search() throws ClientProtocolException, URISyntaxException, IOException, ParseException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/item")
		    .setParameter("page", "1")
		    .setParameter("page_size", "100");
		CloseableHttpResponse response = this.httpGet(queryParameters);
		return response;
	}
	
	public CloseableHttpResponse find(int id) throws ClientProtocolException, URISyntaxException, IOException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/item/"+id)
		    .setParameter("page", "1")
		    .setParameter("page_size", "100");
		CloseableHttpResponse response = this.httpGet(queryParameters);
		
		return response;}
	
	public CloseableHttpResponse post(BaseItem item) throws ClientProtocolException, URISyntaxException, IOException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/item");
		CloseableHttpResponse response = this.httpPost(queryParameters, item);
		
		return response;}
	
	public CloseableHttpResponse put(int id, BaseItem item) throws ClientProtocolException, URISyntaxException, IOException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/item/"+id);
		CloseableHttpResponse response = this.httpPut(queryParameters, item);
		
		return response;
	}

	public List<BaseItem> handelResponseForArrayObject(CloseableHttpResponse response)
			throws ParseException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException {
		BaseItem[] baseItems = null;
		List<BaseItem> listOfBaseItems = new ArrayList<BaseItem>();
		if(response.getStatusLine().getStatusCode()==200){
			String bodyAsString = EntityUtils.toString(response.getEntity());
			//get data from boby
			JSONObject jsonObject = new JSONObject(bodyAsString.toString());
			//Convert json to customers[]
			Gson gson = new Gson();
			baseItems = gson.fromJson(jsonObject.get("data").toString(), BaseItem[].class);
			for (BaseItem item :baseItems){
				listOfBaseItems.add(item);
				}
			}
		else{
			this.handelErrors(response);
			return null;
		}
		return listOfBaseItems;
		
	}

	public BaseItem handelResponseForOneObject(CloseableHttpResponse response) throws ParseException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		if(! (response.getStatusLine().getStatusCode()==200)){
			this.handelErrors(response);
			return null;
		}
		BaseItem baseItem = null;
		String bodyAsString = EntityUtils.toString(response.getEntity());
		//get data from boby
		JSONObject jsonObject = new JSONObject(bodyAsString.toString());
		//Convert json to customers[]
		Gson gson = new Gson();
		baseItem = gson.fromJson(jsonObject.get("data").toString(), BaseItem.class);
		return baseItem;
	}

}
