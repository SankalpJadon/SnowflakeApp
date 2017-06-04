package com.snowflake.pojos.flight;

public class FlightIdentification {

	private String aircraftIdentification;

	private String majorCarrierIdentifier;

	private String iataFlightNumber;
	
	
	public String getAircraftIdentification() {
		return aircraftIdentification;
	}
	public void setAircraftIdentification(String aircraftIdentification) {
		this.aircraftIdentification = aircraftIdentification;
	}

	public String getMajorCarrierIdentifier() {
		return majorCarrierIdentifier;
	}
	public void setMajorCarrierIdentifier(String majorCarrierIdentifier) {
		this.majorCarrierIdentifier = majorCarrierIdentifier;
	}
	public String getIataFlightNumber() {
		return iataFlightNumber;
	}
	public void setIataFlightNumber(String iataFlightNumber) {
		this.iataFlightNumber = iataFlightNumber;
	}
	
}
