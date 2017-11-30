package exceptions;

import org.json.JSONObject;

public class MissingAuthException extends Exception{

	public MissingAuthException(JSONObject jsonObject){
		System.out.println(jsonObject.get("status")+" Caused By: "+jsonObject.getJSONObject("data").get("message"));
	}
}
