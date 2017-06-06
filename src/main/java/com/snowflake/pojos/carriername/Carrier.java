package com.snowflake.pojos.carriername;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "carrier")
public class Carrier {
	
	private String code;
	private String name;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
