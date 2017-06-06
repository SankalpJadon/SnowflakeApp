package com.snowflake.controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.snowflake.pojos.flight.Flight;
import com.snowflake.pojos.icao.IcaoCodes;
import com.snowflake.services.CustomRepository;
import com.snowflake.services.GeneralServices;
import com.snowflake.services.MongoServices;;

@Controller
public class controller {

@Autowired MongoServices mongoService;	
@Autowired CustomRepository customRepository;
@Autowired GeneralServices generalServices;

	@RequestMapping("/")
	public String getIndexPage(){
		return "index";
	}
	
	@RequestMapping("/getAirports")
	public @ResponseBody List<IcaoCodes> getAirports(@RequestParam String city, Model model){
		return mongoService.getAirports(city);
	}
	
	@RequestMapping("/getAirwaysDetails")
	public String getAirwaysDetails(@RequestParam String flightCode, Model model) throws JsonParseException, JsonMappingException, IOException{
		String uri= "https://api.laminardata.aero/v1/airlines/"+flightCode+"/flights?user_key=f82ac2afe027607fc1d2077ca4181b45";
		RestTemplate restTemplate= new RestTemplate();
		Flight[] flight = restTemplate.getForObject(uri, Flight[].class);
	    List<Flight> al= Arrays.asList(flight);
	    Flight f= al.get(4);
	    model.addAttribute("flight",f);
	    return "flightdetails";	            
	}
	
	@RequestMapping("/getFlightDetails")
	public String getFlightDetails(@RequestParam String originAirport,@RequestParam String destinationAirport, Model model) throws JsonParseException, JsonMappingException, IOException{
		String origin= mongoService.getIcao(originAirport);
		String destination= mongoService.getIcao(destinationAirport);
		String uri= "https://api.laminardata.aero/v1/aerodromes/"+origin+"/destinations/"+destination+"/flights?user_key=f82ac2afe027607fc1d2077ca4181b45";
		RestTemplate restTemplate= new RestTemplate();
		Flight[] flight = restTemplate.getForObject(uri, Flight[].class);
		List<Flight> al= Arrays.asList(flight);
		List<Flight> result= generalServices.mapFlightCarriers(al);
		model.addAttribute("originDestinationFlights",result);
	    return "flightdetails";            
	}
}
