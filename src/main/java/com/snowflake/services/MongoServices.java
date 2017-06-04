package com.snowflake.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.snowflake.pojos.icao.IcaoCodes;

@Component
public class MongoServices {

	@Autowired private IcaoRepository rep;
	@Autowired private CustomRepository customRepository;
	
	public List<IcaoCodes> getAirports(String city) {
		
		List<IcaoCodes> list= (List<IcaoCodes>) customRepository.getListOfAirports(city);
		return list;
		
	}
	
	public IcaoCodes getIcao(String city){
		IcaoCodes code= rep.findByCity(city);
		return code;
	}
	
}
