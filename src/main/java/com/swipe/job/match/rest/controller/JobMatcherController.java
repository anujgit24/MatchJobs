package com.swipe.job.match.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swipe.job.match.rest.model.Job;
import com.swipe.job.match.rest.services.JobMatcherService;

@RestController
public class JobMatcherController {

	@Autowired
	JobMatcherService jobMatcherService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(){
		return "<a href=\"http:\\\\localhost:8080/MatchJobs/jobMatch/21\" target=\"_blank\">Go to this link:</a>";
	}

	@RequestMapping(value = "/jobMatch/{userId}", method = RequestMethod.GET, produces = "application/json")
	public List<String> matchJob(@PathVariable String userId) {
		List<String> topThreeMatchedJobs = new ArrayList<String>();
		int userId_input = 0;
		try {
			userId_input = Integer.parseInt(userId);
		} catch (NumberFormatException nfe) {
			//Returning empty list
			return topThreeMatchedJobs;
		}

		List<Job> matchedJobs = jobMatcherService.fetchMatchedJobs(userId_input);
		
		for (int i = 0; i < matchedJobs.size() && i < 3; i++) {

			topThreeMatchedJobs.add(matchedJobs.get(i).getDetails());
		}

		return topThreeMatchedJobs;
	}

}
