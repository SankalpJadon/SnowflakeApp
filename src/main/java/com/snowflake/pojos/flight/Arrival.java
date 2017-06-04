package com.snowflake.pojos.flight;

public class Arrival {
	private ArrivalAerodromeOriginal arrivalAerodrome;
	private ArrivalFixTime arrivalFixTime;
	
	public ArrivalAerodromeOriginal getArrivalAerodrome() {
		return arrivalAerodrome;
	}
	public void setArrivalAerodrome(ArrivalAerodromeOriginal arrivalAerodrome) {
		this.arrivalAerodrome = arrivalAerodrome;
	}
	public ArrivalFixTime getArrivalFixTime() {
		return arrivalFixTime;
	}
	public void setArrivalFixTime(ArrivalFixTime arrivalFixTime) {
		this.arrivalFixTime = arrivalFixTime;
	}
	
}
