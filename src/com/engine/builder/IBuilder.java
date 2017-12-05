package com.engine.builder;

import com.engine.builder.dao.IDAO;
import com.engine.builder.pojo.IPOJO;

public interface IBuilder {

	public boolean build();
	
	public IDAO getDao();
	public void setDao(IDAO dao);
	
	public IPOJO getPojo();
	public void setPojo(IPOJO pojo);
}
