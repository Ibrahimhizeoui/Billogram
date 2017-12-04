package api;

import java.io.IOException;
import java.net.URISyntaxException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateFormatUtils;
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
import model.invoices.InvoiceModel;
import model.item.BaseItem;

public class InvoiceApi extends HttpApi implements HandelResponse<InvoiceModel>{

	public CloseableHttpResponse search() throws ClientProtocolException, URISyntaxException, IOException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/billogram")
		    .setParameter("page", "1")
		    .setParameter("page_size", "100");
		CloseableHttpResponse response = this.httpGet(queryParameters);
		
		return response;
		}

	public CloseableHttpResponse find(String id) throws ClientProtocolException, URISyntaxException, IOException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/billogram/"+id)
		    .setParameter("page", "1")
		    .setParameter("page_size", "100");
		CloseableHttpResponse response = this.httpGet(queryParameters);
		
		return response;}
	
	public CloseableHttpResponse post(InvoiceModel invoice) throws ClientProtocolException, URISyntaxException, IOException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/billogram");
		return this.httpPost(queryParameters,invoice);} 
	
	public CloseableHttpResponse put(String id,InvoiceModel invoice) throws ClientProtocolException, URISyntaxException, IOException{
		URIBuilder queryParameters = new URIBuilder();
		queryParameters.setScheme("https").setHost(endpoint).setPath("/billogram/"+id);
		return this.httpPost(queryParameters,invoice);}

	public List<InvoiceModel> handelResponseForArrayObject(CloseableHttpResponse response)
			throws ParseException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException,
			NotFoundOrAvailableException {
		if(!(response.getStatusLine().getStatusCode()==200)){
			this.handelErrors(response);
			return null;
		}
		InvoiceModel[] invoiceModels = null;
		List<InvoiceModel> listOfBaseItems = new ArrayList<InvoiceModel>();
		String bodyAsString = EntityUtils.toString(response.getEntity());
		//Get data from boby
		JSONObject jsonObject = new JSONObject(bodyAsString);
		//Convert json to invoiceModels[]
	
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer()).create();
		
		invoiceModels = gson.fromJson(jsonObject.get("data").toString(), InvoiceModel[].class);
		for (InvoiceModel invoiceModel :invoiceModels){
			listOfBaseItems.add(invoiceModel);
			}
		return listOfBaseItems;
	}

	public InvoiceModel handelResponseForOneObject(CloseableHttpResponse response) throws ParseException, IOException,
			InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException {
		if(! (response.getStatusLine().getStatusCode()==200)){
			this.handelErrors(response);
			return null;
		}
		InvoiceModel invoiceModel = null;
		String bodyAsString = EntityUtils.toString(response.getEntity());
		//Get data from boby
		JSONObject jsonObject = new JSONObject(bodyAsString);
		//Convert json to invoiceModels[]
	
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer()).create();
		invoiceModel = gson.fromJson(jsonObject.get("data").toString(), InvoiceModel.class);
		return invoiceModel;
	}
	
	
}
