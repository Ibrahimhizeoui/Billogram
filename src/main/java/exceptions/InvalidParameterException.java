package exceptions;

import org.json.JSONObject;

public class InvalidParameterException extends Exception {
	public InvalidParameterException(JSONObject jsonObject){
		System.out.println(jsonObject.get("status")+" Caused By: "+jsonObject.getJSONObject("data").get("message"));
	}

}
