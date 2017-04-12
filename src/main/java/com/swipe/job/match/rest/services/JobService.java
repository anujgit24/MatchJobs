package com.swipe.job.match.rest.services;

import java.util.List;

import com.swipe.job.match.rest.model.Job;

public interface JobService {
	
	public static final String JOBS_REST_URL = "http://test.swipejobs.com/api/jobs";
	
	public List<Job> fetchJobDetails();
	
}
