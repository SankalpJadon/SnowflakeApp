package com.snowflake.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.snowflake.pojos.flight.Flight;

@Component
public class GeneralServices {
	
	@Autowired CustomRepository rep;
	
	public List<Flight> mapFlightCarriers(List<Flight> input){
		List<Flight> flights = new ArrayList<Flight>();
		for(Flight flight: input){
			if(flight.getFlightIdentification()!=null){
				String str= flight.getFlightIdentification().getMajorCarrierIdentifier();
				String s= str.substring(0,2);
				String carrier_name= rep.getCarrier(s);
				flight.getFlightIdentification().setCarrierName(carrier_name);
			}
		}
		return input;
	}
}
