package com.engine.builder.dao;

import com.engine.builder.pojo.IPOJO;

public interface IDAO {

	public IPOJO get();
	
	public IPOJO getPojo();
	
	public void setPojo(IPOJO pojo);
}
