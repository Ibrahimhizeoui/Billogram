import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import api.Customer;
import api.ItemApi;
import exceptions.AccessDeniedException;
import exceptions.InvalidParameterException;
import exceptions.MissingAuthException;
import exceptions.NotFoundOrAvailableException;
import model.customers.Customers;


public class Main {

	public static void main(String[] args) throws ClientProtocolException, URISyntaxException, IOException, ParseException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ItemApi cus = (ItemApi)context.getBean("itemApi");
		Customers model = (Customers)context.getBean("modelCustomer");
		
				//List<Customers> customers = cus.search();
	    /*for(Customers customer : customers){
	    	System.out.println(customer);
	    }*/
	    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
	    //cus.put(1,modelAsString);
		//Customers modelCustomer = cus.find(1);
	    //System.out.println(modelCustomer);

	}

}
