package com.swipe.job.match.rest.utility;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class JsonParserUtility {
	
	
	
	public static JSONArray fetchData(String restUrl){
	RestTemplate restTemplate = new RestTemplate();
	Object object = null;
	ResponseEntity<String> response = restTemplate.getForEntity(
			restUrl,String.class);
	JSONParser jsonParser = new JSONParser();
	try {
		object = jsonParser.parse(response.getBody());
	} catch (ParseException e) {

		e.printStackTrace();
	}
	
	JSONArray arrayObj = (JSONArray) object;
	return arrayObj;
	}
	
	public static List<String> JsonArrayToList(JSONArray jsonArr){
		List<String> list = new ArrayList<String>();

		if (jsonArr != null) {
			int len = jsonArr.size();
			for (int i = 0; i < len; i++) {
				list.add(jsonArr.get(i).toString());
			}
		}
		return list;
	}
	


}
