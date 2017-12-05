package com.engine.builder.pojo;

public class Currency implements IPOJO {

	protected String country = null;
	protected String value = null;
	
	public Currency() {
		this.country = "USD";
		this.value = "1";
	}
	
	public Currency(String country, String value) {
		this.country = country;
		this.value = value;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setPath(String path) {}
}
