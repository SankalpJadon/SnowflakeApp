package com.snowflake.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.snowflake.pojos.carriername.Carrier;
import com.snowflake.pojos.icao.IcaoCodes;


@Repository
public class CustomRepository {

	@Autowired MongoTemplate mongoTemplate;
	
	public Collection getListOfAirports(String city){
		return mongoTemplate.find(Query.query(new Criteria()
                .orOperator(Criteria.where("city").regex(city, "i"))
                ), IcaoCodes.class);
	}
	
	public IcaoCodes getIcao(String city){
		Query query = new Query();
		query.addCriteria(Criteria.where("airport").is(city));
		IcaoCodes icao = mongoTemplate.findOne(query, IcaoCodes.class);
		return icao;
	}
	
	public String getCarrier(String str){
		Query query = new Query();
		query.addCriteria(Criteria.where("code").is(str));
		Carrier c=  mongoTemplate.findOne(query, Carrier.class);
		return c.getName();
	}
	
}
