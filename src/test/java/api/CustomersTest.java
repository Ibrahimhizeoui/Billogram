package api;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.hamcrest.core.IsInstanceOf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.hamcrest.CoreMatchers.*;
import exceptions.AccessDeniedException;
import exceptions.InvalidParameterException;
import exceptions.MissingAuthException;
import exceptions.NotFoundOrAvailableException;
import junit.framework.TestCase;
import model.customers.Address;
import model.customers.Contact;
import model.customers.Customers;
import model.customers.DeliveryAddress;

public class CustomersTest extends TestCase {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Customer apicustomer = (Customer)context.getBean("apiCustomer");
	Customers modelCustomer = null;
	List<Customers> arrayModelCustomer =  null;
	
	public void testSearchAllRequst() throws ClientProtocolException, ParseException, URISyntaxException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		CloseableHttpResponse response = apicustomer.search();
		assertEquals(response.getStatusLine().getStatusCode(),200);
	}
	
	public void testFind() throws ClientProtocolException, ParseException, URISyntaxException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException {
			CloseableHttpResponse response = apicustomer.find(1);
	    	assertEquals(response.getStatusLine().getStatusCode(),200);
	   }
	   
	   public void testPostRequst() throws ClientProtocolException, ParseException, URISyntaxException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		    Customers model = new Customers();
		    model.setName("Xmen");
			model.setNotes("xx");
			model.setOrg_no(null);
			model.setVat_no("SE556677889901");
			Contact contact = new Contact();
			contact.setEmail("ib92g@gmail.com");
			contact.setName("ib922");
			contact.setPhone("0712223344");
			model.setContact(contact);
			Address address = new Address();
			address.setCareof("khaled");
			address.setUse_careof_as_attention(false);
			address.setStreet_address("Flygarvägen 189B");
			address.setZipcode("175 69");
			address.setCity("Järfälla");
			address.setCountry("SE");
			model.setAddress(address);
			DeliveryAddress deliveryAddress = new DeliveryAddress();
			deliveryAddress.setName("khaled");
			deliveryAddress.setCareof("khaled");
			deliveryAddress.setStreet_address("Flygarvägen 189B");
			deliveryAddress.setZipcode("175 69");
			deliveryAddress.setCity("Järfälla");
			deliveryAddress.setCountry("SE");
			model.setDelivery_address(deliveryAddress);
			model.setCompany_type("individual");
			CloseableHttpResponse response = apicustomer.post(model);
			assertEquals(response.getStatusLine().getStatusCode(),200);
	   }
	   public void testPutRequst() throws ClientProtocolException, ParseException, URISyntaxException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		    Customers model = apicustomer.handelResponseForOneObect(apicustomer.find(1));
		    model.setName("Zlatan");
			model.setNotes("xx");
			model.setOrg_no(null);
			model.setVat_no("SE556677889901");
			Contact contact = new Contact();
			contact.setEmail("ib92g@gmail.com");
			contact.setName("ib922");
			contact.setPhone("0712223344");
			model.setContact(contact);
			Address address = new Address();
			address.setCareof("khaled");
			address.setUse_careof_as_attention(false);
			address.setStreet_address("Flygarvägen 189B");
			address.setZipcode("175 69");
			address.setCity("Järfälla");
			address.setCountry("SE");
			model.setAddress(address);
			DeliveryAddress deliveryAddress = new DeliveryAddress();
			deliveryAddress.setName("khaled");
			deliveryAddress.setCareof("khaled");
			deliveryAddress.setStreet_address("Flygarvägen 189B");
			deliveryAddress.setZipcode("175 69");
			deliveryAddress.setCity("Järfälla");
			deliveryAddress.setCountry("SE");
			model.setDelivery_address(deliveryAddress);
			//READ_ONLY_PARAMETER : updated_at & created_at
			model.setCreated_at(null);
			model.setUpdated_at(null);
			model.setCompany_type("individual");
			CloseableHttpResponse response = apicustomer.put("1",model);
			assertEquals(response.getStatusLine().getStatusCode(),200);
	   }
}
