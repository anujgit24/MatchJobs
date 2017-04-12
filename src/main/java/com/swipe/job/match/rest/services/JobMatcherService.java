package com.swipe.job.match.rest.services;

import java.util.List;

import com.swipe.job.match.rest.model.Job;

public interface JobMatcherService {
	
	public List<Job> fetchMatchedJobs(Integer searchString);
	
	

}
