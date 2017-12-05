package com.tools.converter.fromclass;

import com.engine.builder.pojo.Currency;

public class Computer {

	protected Currency[] tab = null;
	
	public Computer() {}
	
	public Computer(Currency[] tab) {
		this.tab = tab;
	}
	
	public boolean run() {
		return false;
	}

	public Currency[] getTab() {
		return tab;
	}

	public void setTab(Currency[] tab) {
		this.tab = tab;
	}
}
