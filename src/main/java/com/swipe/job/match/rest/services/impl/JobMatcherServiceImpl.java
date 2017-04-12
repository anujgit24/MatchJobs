package com.swipe.job.match.rest.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swipe.job.match.rest.model.Job;
import com.swipe.job.match.rest.model.Worker;
import com.swipe.job.match.rest.services.JobMatcherService;
import com.swipe.job.match.rest.services.JobService;
import com.swipe.job.match.rest.services.WorkerService;

@Service
public class JobMatcherServiceImpl implements JobMatcherService {

	private static final String WORKER_NOT_FOUND = "";

	@Autowired
	WorkerService workerService;

	@Autowired
	JobService jobService;

	public List<Job> fetchMatchedJobs(Integer userId) {

		List<String> workers = workerService.fetchWorkerDetails();

		String workerFound = workerService.searchForWorkerByUserId(workers,
				userId);

		List<Job> jobs = jobService.fetchJobDetails();

		Worker worker = null;

		if (WORKER_NOT_FOUND.equals(workerFound)) {
			// return empty list
			return new ArrayList<Job>();
		} else {
			worker = workerService
					.convertWorkerJsonObject2JavaObject(workerFound);
		}

		// Matching logic

		// Rank on Certificate
		List<String> certificates = worker.getCertificates();
		for (String certificate : certificates) {
			matchJob(jobs, certificate);
		}

		// Rank on DriverLiscence
		matchJob(jobs, String.valueOf(worker.isHasDriversLicense()));

		sortJobsOnRank(jobs);

		return jobs;
	}

	private void matchJob(List<Job> jobs, String searchString) {

		if (searchString != null) {
		 jobs.parallelStream().forEach(job -> {if(job.getDetails().contains(searchString)){ int count = job.getRank(); job.setRank(++count); }});
		}

	}

	private void sortJobsOnRank(List<Job> jobs) {

		Collections.sort(jobs, new Comparator<Job>() {

			@Override
			public int compare(Job job1, Job job2) {

				return job2.getRank().compareTo(job1.getRank());
			}

		});
	}

}
