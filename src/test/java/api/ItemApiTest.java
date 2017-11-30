package api;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exceptions.AccessDeniedException;
import exceptions.InvalidParameterException;
import exceptions.MissingAuthException;
import exceptions.NotFoundOrAvailableException;
import junit.framework.TestCase;
import model.item.BaseItem;
import model.item.Bookkeeping;

public class ItemApiTest extends TestCase {

	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	ItemApi itemApi = (ItemApi) context.getBean("itemApi");
	BaseItem modelItem = (BaseItem)context.getBean("modelItem");
	Bookkeeping bookkeeping = (Bookkeeping)context.getBean("bookkeeping");
	public void testSearchAllRequst() throws ClientProtocolException, ParseException, URISyntaxException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		CloseableHttpResponse response = itemApi.search();
		assertEquals(response.getStatusLine().getStatusCode(),200);
	}
	
	public void testFind() throws ClientProtocolException, URISyntaxException, IOException{
		CloseableHttpResponse response = itemApi.find(1);
		assertEquals(response.getStatusLine().getStatusCode(),200);
	}
	
	public void testPost() throws ClientProtocolException, URISyntaxException, IOException{
		bookkeeping.setIncome_account("302");
		bookkeeping.setVat_account("303");
		modelItem.setTitle("cc");
		modelItem.setDescription("tt");
		modelItem.setPrice(12);
		modelItem.setVat(12);
		modelItem.setUnit("hour");
		modelItem.setBookkeeping(bookkeeping);
		CloseableHttpResponse response = itemApi.post(modelItem);
		assertEquals(response.getStatusLine().getStatusCode(),200);
	}
	
	public void testPut() throws ClientProtocolException, URISyntaxException, IOException{
		bookkeeping.setIncome_account("302");
		bookkeeping.setVat_account("303");
		modelItem.setTitle("hhhhhhh");
		modelItem.setDescription("hhhhhh");
		modelItem.setPrice(13);
		modelItem.setVat(13);
		modelItem.setUnit("hour");
		modelItem.setBookkeeping(bookkeeping);
		CloseableHttpResponse response = itemApi.put(1,modelItem);
		assertEquals(response.getStatusLine().getStatusCode(),200);
	}
	
	public void testHandelResponseForOneObject() throws ClientProtocolException, URISyntaxException, IOException, ParseException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		CloseableHttpResponse response = itemApi.find(1);
		modelItem = itemApi.handelResponseForOneObject(response);
		assertEquals(modelItem.getDescription(),"hhhhhh");
	}
	
	public void testhandelResponseForOneObject() throws ClientProtocolException, URISyntaxException, IOException, ParseException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		CloseableHttpResponse response = itemApi.search();
		List<BaseItem> modelItems = itemApi.handelResponseForArrayObject(response);
		for(BaseItem item:modelItems){
			System.out.println(item);
		}
	}
}
