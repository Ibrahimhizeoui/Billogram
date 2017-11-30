package api;

import java.io.IOException;
import java.util.List;

import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;

import exceptions.AccessDeniedException;
import exceptions.InvalidParameterException;
import exceptions.MissingAuthException;
import exceptions.NotFoundOrAvailableException;

public interface HandelResponse<T> {
	
	public List<T> handelResponseForArrayObject(CloseableHttpResponse response) throws ParseException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException;
	
	public T handelResponseForOneObject(CloseableHttpResponse response) throws ParseException, IOException, InvalidParameterException, MissingAuthException, AccessDeniedException, NotFoundOrAvailableException;

}
