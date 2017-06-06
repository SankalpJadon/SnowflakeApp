package com.snowflake.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.snowflake.pojos.icao.IcaoCodes;

@Component
public class MongoServices {

	@Autowired private CustomRepository customRepository;
	
	public List<IcaoCodes> getAirports(String city) {
		
		@SuppressWarnings("unchecked")
		List<IcaoCodes> list= (List<IcaoCodes>) customRepository.getListOfAirports(city);
		return list;
		
	}
	
	public String getIcao(String city){
		String code= customRepository.getIcao(city).getIcao();
		return code;
	}

}
