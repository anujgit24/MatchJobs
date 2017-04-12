package com.swipe.job.match.rest.model;

public class Name {
	
	String first;
	String last;
	
	public Name() {
		
	}
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}

	@Override
	public String toString() {
		return "Name [first=" + first + ", last=" + last + "]";
	}
	
	

}
