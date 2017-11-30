package exceptions;

import org.json.JSONObject;

public class AccessDeniedException extends Exception{

	public AccessDeniedException(JSONObject jsonObject){
		System.out.println(jsonObject.get("status")+" Caused By: "+jsonObject.getJSONObject("data").get("message"));
	}
}
