package api;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
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
		arrayModelCustomer = apicustomer.search();
		assertNotNull(arrayModelCustomer);
	}
	
	public void testFind() throws ClientProtocolException, ParseException, URISyntaxException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException {
	    	modelCustomer = apicustomer.find(1);
		    assertNotNull(modelCustomer);
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
			modelCustomer = apicustomer.post(model);
			assertNotNull(modelCustomer);
	   }
	   public void testPutRequst() throws ClientProtocolException, ParseException, URISyntaxException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException{
		    String s ="Customers [name=Zlatan, notes=xx, org_no=, vat_no=SE556677889901, contact=Contact [name=ib922, email=ib92g@gmail.com, phone=0712223344], address=Address [careof=khaled, use_careof_as_attention=false, street_address=Flygarvägen 189B, zipcode=17569, city=Järfälla, country=SE], delivery_address=DeliveryAddress [careof=khaled, streetAddress=Flygarvägen 189B, zipcode=17569, city=Järfälla, country=SE], createdAt=null, updatedAt=null, company_type=individual]";
		    Customers model = apicustomer.find(1);
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
			model.setCompany_type("individual");
			modelCustomer = apicustomer.put(1,model);
			assertNotNull(modelCustomer);
	   }
}
