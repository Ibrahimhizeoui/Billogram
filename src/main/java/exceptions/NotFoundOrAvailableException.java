package exceptions;

import org.json.JSONObject;

public class NotFoundOrAvailableException extends Exception {

	public NotFoundOrAvailableException(JSONObject jsonObject){
		System.out.println(jsonObject.get("status")+" Caused By: "+jsonObject.getJSONObject("data").get("message"));
	}
}
