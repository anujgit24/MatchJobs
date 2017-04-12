package com.swipe.job.match.rest.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.springframework.stereotype.Component;

import com.swipe.job.match.rest.model.Job;
import com.swipe.job.match.rest.services.JobService;
import com.swipe.job.match.rest.utility.JsonParserUtility;

@Component
public class JobServiceImpl implements JobService{

	public List<Job> fetchJobDetails() {

		JSONArray jobsArr = JsonParserUtility.fetchData(JOBS_REST_URL);

		List<Job> jobs = new ArrayList<Job>();

		if (jobsArr != null) {
			int len = jobsArr.size();
			for (int i = 0; i < len; i++) {
				jobs.add(new Job(0, (jobsArr.get(i).toString())));
			}
		}
		return jobs;
	}

	
}
