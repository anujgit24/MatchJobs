package com.swipe.job.match.rest.services;

import java.util.List;

import com.swipe.job.match.rest.model.Worker;

public interface WorkerService {
	
	public static final String WORKERS_REST_URL = "http://test.swipejobs.com/api/workers";
	
	public List<String> fetchWorkerDetails();
	

	public String searchForWorkerByUserId(List<String> workers, Integer userId);
	
	
	public Worker convertWorkerJsonObject2JavaObject(String workerDetail);

}
