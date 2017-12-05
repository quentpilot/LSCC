package com.engine.builder;

import com.engine.builder.dao.IDAO;
import com.engine.builder.pojo.Config;
import com.engine.builder.pojo.IPOJO;

public abstract class Builder implements IBuilder {

	protected IDAO dao = null;
	protected Config pojo = null;
	protected IPOJO response = null;
	
	public Builder() {}
	
	public Builder(IDAO dao, Config pojo) {
		this.setDao(dao);
		this.setPojo(pojo);
	}
	
	public Builder(IDAO dao) {
		this.setDao(dao);
	}
	
	public Builder(Config pojo) {
		this.setPojo(pojo);
	}
	
	public boolean build() {
		if (this.getDao() != null && this.getPojo() != null) {
			this.getDao().setPojo(this.getPojo());
			this.getDao();
			this.setResponse(this.getDao().getPojo());
			return true;
		}
		return false;
	}
	
	public IDAO getDao() {
		return this.dao;
	}

	public void setDao(IDAO dao) {
		this.dao = dao;
	}

	public Config getPojo() {
		return this.pojo;
	}

	public void setPojo(Config pojo) {
		this.pojo = pojo;
	}

	public IPOJO getResponse() {
		return response;
	}

	public void setResponse(IPOJO response) {
		this.response = response;
	}

}
