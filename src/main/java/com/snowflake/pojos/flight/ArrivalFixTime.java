package com.snowflake.pojos.flight;

public class ArrivalFixTime {
	private String type;
	private Actual actual;
	private Estimated estimated;
	private Initial initial;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Estimated getEstimated() {
		return estimated;
	}
	public void setEstimated(Estimated estimated) {
		this.estimated = estimated;
	}
	public Initial getInitial() {
		return initial;
	}
	public void setInitial(Initial initial) {
		this.initial = initial;
	}
	
}
