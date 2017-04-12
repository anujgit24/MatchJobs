package com.swipe.job.match.rest.model;

public class JobSearchAddress {
	
	String unit;
	int maxJobDistance;
	double latitude;
	double longitude;
	
	public JobSearchAddress() {
		
	}
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getMaxJobDistance() {
		return maxJobDistance;
	}
	public void setMaxJobDistance(int maxJobDistance) {
		this.maxJobDistance = maxJobDistance;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "JobSearchAddress [unit=" + unit + ", maxJobDistance="
				+ maxJobDistance + ", latitude=" + latitude + ", longitude="
				+ longitude + "]";
	}
	
	

}
