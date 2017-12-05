package com.engine.builder.pojo;

public class Config implements IPOJO {

	protected String userfile = null;
	protected String path = null;
	
	protected Currency[] currencies = null;
	
	protected String type = null; 
	protected String value = null;
	
	public Config() {
		
	}
	
	public Config(String type, String value) {
		this.type = type;
		this.value = value;
	}

	public Config(Currency[] currencies) {
		this.currencies = currencies;
	}

	public String getUserfile() {
		return userfile;
	}

	public void setUserfile(String userfile) {
		this.userfile = userfile;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Currency[] getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Currency[] currencies) {
		this.currencies = currencies;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
