package com.snowflake.services;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.snowflake.pojos.icao.IcaoCodes;

@Document(collection = "icao")
public interface IcaoRepository extends MongoRepository<IcaoCodes, String> {

    public IcaoCodes findByCity(String city);

} 