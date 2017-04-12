package com.swipe.job.match.rest.model;

public class Job {
	
	Integer rank;
	String details;
	
	
	
	public Job(Integer rank, String details) {
		super();
		this.rank = rank;
		this.details = details;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Job [rank=" + rank + ", details=" + details + "]";
	}
	
	
	

}
