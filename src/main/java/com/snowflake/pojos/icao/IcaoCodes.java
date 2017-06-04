package com.snowflake.pojos.icao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "icao")
public class IcaoCodes {
	@Id
	private String icao;
	private String type;
	private String name;
	private String country;
	private String state;
	private String city;
	private String airport;
	
	public String getIcao() {
		return icao;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getAirport() {
		return airport;
	}
	
	
	
}
