package com.snowflake.pojos.flight;

public class Departure {
	private DepartureAerodrome departureAerodrome;
	private DepartureFixTime departureFixTime;
	public DepartureAerodrome getDepartureAerodrome() {
		return departureAerodrome;
	}
	public void setDepartureAerodrome(DepartureAerodrome departureAerodrome) {
		this.departureAerodrome = departureAerodrome;
	}
	public DepartureFixTime getDepartureFixTime() {
		return departureFixTime;
	}
	public void setDepartureFixTime(DepartureFixTime departureFixTime) {
		this.departureFixTime = departureFixTime;
	}
	
	
}
