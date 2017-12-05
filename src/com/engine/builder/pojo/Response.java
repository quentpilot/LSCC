package com.engine.builder.pojo;

public class Response implements IPOJO {
	
	protected Currency[] tab = null;
	
	public Response() {}
	
	public Response(Currency[] values) {
		this.tab = values;
	}

	public Currency[] getTab() {
		return tab;
	}

	public void setTab(Currency[] tab) {
		this.tab = tab;
	}
	
	public void setPath(String string) {}
}
