package com.swipe.job.match.rest.model;

public class Availability {
	
	int dayIndex;
	String title;
	
	public Availability() {
		
	}
	
	public int getDayIndex() {
		return dayIndex;
	}
	public void setDayIndex(int dayIndex) {
		this.dayIndex = dayIndex;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Availability [dayIndex=" + dayIndex + ", title=" + title + "]";
	}
	
	

}
