package com.snowflake.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.snowflake.pojos.icao.IcaoCodes;

@Repository
public class CustomRepository {

	@Autowired MongoTemplate mongoTemplate;
	
	public Collection getListOfAirports(String city){
		return mongoTemplate.find(Query.query(new Criteria()
                .orOperator(Criteria.where("city").regex(city, "i"))
                ), IcaoCodes.class);
	}
	
}
