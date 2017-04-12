package com.swipe.job.match.rest.model;

import java.util.List;

public class Worker {
	
	int rating;
	boolean isActive;
	int userId;
	String transportation;
	List<String> skills;
	List<String> certificates;
	List<Availability>  availability;
	JobSearchAddress jobSearchAddress;
	boolean hasDriversLicense;
	String phone;
	Name name;
	String guid;
	String email;
	int age;
	
	public Worker() {
		
	}

	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getTransportation() {
		return transportation;
	}
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public List<String> getCertificates() {
		return certificates;
	}
	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}
	public boolean isHasDriversLicense() {
		return hasDriversLicense;
	}
	public void setHasDriversLicense(boolean hasDriversLicense) {
		this.hasDriversLicense = hasDriversLicense;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Availability> getAvailability() {
		return availability;
	}

	public void setAvailability(List<Availability> availability) {
		this.availability = availability;
	}

	
	

	public JobSearchAddress getJobSearchAddress() {
		return jobSearchAddress;
	}

	public void setJobSearchAddress(JobSearchAddress jobSearchAddress) {
		this.jobSearchAddress = jobSearchAddress;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Worker [rating=" + rating + ", isActive=" + isActive
				+ ", userId=" + userId + ", transportation=" + transportation
				+ ", skills=" + skills + ", certificates=" + certificates
				+ ", availability=" + availability + ", jobSearchAddress="
				+ jobSearchAddress + ", hasDriversLicense=" + hasDriversLicense
				+ ", phone=" + phone + ", name=" + name + ", guid=" + guid
				+ ", email=" + email + ", age=" + age + "]";
	}

	
	
	

}
