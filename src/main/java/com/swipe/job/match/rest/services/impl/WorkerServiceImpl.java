package com.swipe.job.match.rest.services.impl;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swipe.job.match.rest.model.Worker;
import com.swipe.job.match.rest.services.WorkerService;
import com.swipe.job.match.rest.utility.JsonParserUtility;

@Component
public class WorkerServiceImpl implements WorkerService{

	
	public List<String> fetchWorkerDetails() {
		JSONArray workerArr = JsonParserUtility.fetchData(WORKERS_REST_URL);

		List<String> workers = JsonParserUtility.JsonArrayToList(workerArr);

		return workers;
	}

	public String searchForWorkerByUserId(List<String> workers, Integer userId) {
		String workerFound = "";
    	workerFound = workers.parallelStream().filter(worker -> worker.contains(",\"userId\":" + userId + ",")).findFirst().get();
		return workerFound;
	}

	public Worker convertWorkerJsonObject2JavaObject(String workerDetail) {

		ObjectMapper mapper = new ObjectMapper();
		Worker worker = new Worker();

		// convert JSON Object to Java Object
		try {
			worker = mapper.readValue(workerDetail, Worker.class);
		} catch (IOException e) {

			e.printStackTrace();
		}

		return worker;
	}

}
