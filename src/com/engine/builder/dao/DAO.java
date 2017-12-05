package com.engine.builder.dao;

import com.engine.builder.pojo.IPOJO;

public class DAO implements IDAO {

	protected IPOJO pojo = null;
	
	public DAO() {}
	
	public IPOJO get() { // set pojo attributes
		return this.getPojo();
	}
	
	public IPOJO getPojo() {
		return this.pojo;
	}
	
	public void setPojo(IPOJO pojo) {
		this.pojo = pojo;
	}
	
}
