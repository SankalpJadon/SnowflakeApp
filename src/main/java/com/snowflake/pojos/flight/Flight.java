package com.snowflake.pojos.flight;

import java.util.Date;

public class Flight {
	private Date timestamp;
	private Arrival arrival;
	private Departure departure;
	private FlightIdentification flightIdentification;
	private FlightStatus flightStatus;
	private Gufi gufi;
	
	public Date getTimestamp() { 
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public Arrival getArrival() {
		return arrival;
	}
	public void setArrival(Arrival arrival) {
		this.arrival = arrival;
	}
	public Departure getDeparture() {
		return departure;
	}
	public void setDeparture(Departure departure) {
		this.departure = departure;
	}

	public FlightIdentification getFlightIdentification() {
		return flightIdentification;
	}
	public void setFlightIdentification(FlightIdentification flightIdentification) {
		this.flightIdentification = flightIdentification;
	}
	public FlightStatus getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(FlightStatus flightStatus) {
		this.flightStatus = flightStatus;
	}
	public Gufi getGufi() {
		return gufi;
	}
	public void setGufi(Gufi gufi) {
		this.gufi = gufi;
	}
	
}
