package com.snowflake.pojos.flight;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;

public class Actual {
	
	private Date timestamp;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
}
