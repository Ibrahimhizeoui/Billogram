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
import model.customers.Customers;
import model.invoices.InvoiceModel;
import model.invoices.Item;
import model.item.BaseItem;

public class InvoiceApiTest extends TestCase {

	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	InvoiceApi invoiceApi = (InvoiceApi) context.getBean("invoiceApi");
	InvoiceModel invoiceModel = (InvoiceModel)context.getBean("invoiceModel");
	Customer apiCustomer = (Customer)context.getBean("apiCustomer");
	Customers modelCustomer = (Customers)context.getBean("modelCustomer");
	BaseItem modelItem = (BaseItem)context.getBean("modelItem");
	Item item1  = (Item)context.getBean("item");
	Item item2  = (Item)context.getBean("item");
	/*public void testSearchAllRequst() throws ClientProtocolException, URISyntaxException, IOException{
		CloseableHttpResponse response = invoiceApi.search();
		System.out.println(EntityUtils.toString(response.getEntity(),"UTF-8"));
		
		assertEquals(response.getStatusLine().getStatusCode(),200);
	}
	
	public void testFind() throws ClientProtocolException, URISyntaxException, IOException{
		CloseableHttpResponse response = invoiceApi.find("zeY37WJ");
		System.out.println(EntityUtils.toString(response.getEntity(),"UTF-8"));
		assertEquals(response.getStatusLine().getStatusCode(),200);
	}
	
	public void testPost() throws ClientProtocolException, ParseException, URISyntaxException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		modelCustomer.setCustomer_no(1);
		invoiceModel.setCustomer(modelCustomer);
		
		item1.setItem_no("3");
		item1.setCount(25);
		item1.setDiscount(0);
		item2.setItem_no("4");
		item2.setCount(1);
		item2.setDiscount(0);
		
		Item items[] = new Item[2];
		items[0]= item1;
		items[1]= item2;
		invoiceModel.setItems(items);
		invoiceModel.setInvoice_date("2017-11-11");
		CloseableHttpResponse response = invoiceApi.post(invoiceModel);
		assertEquals(response.getStatusLine().getStatusCode(),200);
	}
	
	public void testPut() throws ClientProtocolException, URISyntaxException, IOException{
		modelCustomer.setCustomer_no(2);
		invoiceModel.setCustomer(modelCustomer);
		Item items[] = new Item[2];
		items[0]= item1;
		invoiceModel.setInvoice_date("2017-12-01");
		CloseableHttpResponse response = invoiceApi.put("zeY37WJ",invoiceModel);
		System.out.println(EntityUtils.toString(response.getEntity(),"UTF-8"));
		assertEquals(response.getStatusLine().getStatusCode(),200);
		
	}
	
	public void testHandelResponseForArrayObject() throws ClientProtocolException, URISyntaxException, IOException, ParseException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		CloseableHttpResponse response = invoiceApi.search();
		List<InvoiceModel> listOfBaseItems = invoiceApi.handelResponseForArrayObject(response);
		for(InvoiceModel invoice:listOfBaseItems){
			System.out.println(invoice);
		}
		
	}*/
	
	public void testHandelResponseForOneObject() throws ClientProtocolException, URISyntaxException, IOException, ParseException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		CloseableHttpResponse response = invoiceApi.find("yxY3yVJ");
		InvoiceModel invoice = invoiceApi.handelResponseForOneObject(response);
		System.out.println(invoice);
		
		
	}
}
