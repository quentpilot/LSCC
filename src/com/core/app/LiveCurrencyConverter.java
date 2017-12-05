package com.core.app;

import java.util.Map;

import com.engine.builder.dao.ConfigDAO;
import com.engine.builder.lcc.LCCBuilder;
import com.engine.builder.pojo.Config;
import com.engine.builder.pojo.Currency;
import com.engine.factory.Factory;

public class LiveCurrencyConverter extends Application {
	
	public LiveCurrencyConverter() {}
	
	public LiveCurrencyConverter(Map<String, Object> options) {
		this.setConfig(this.setConfig(options));
		this.setFactory(new Factory());
		this.setBuilder(new LCCBuilder());
	}
	
	public LiveCurrencyConverter(String options) {
		this.setConfig(this.setConfig(options));
		this.setFactory(new Factory());
		this.setBuilder(new LCCBuilder());
	}
	
	public LiveCurrencyConverter(Config options) {
		this.setConfig(options);
		this.setFactory(new Factory());
		this.setBuilder(new LCCBuilder(null, options));
	}
	
	public LiveCurrencyConverter(String[] options) {
		this.setOptions(options);
		this.setFactory(new Factory());
		this.setBuilder(new LCCBuilder());
	}
	
	public boolean build() {
		
		if (this.getConfig() != null && this.getConfig().getCurrencies() == null && this.getConfig().getUserfile() != null) // set builder dao before to build
			this.getBuilder().setDao(new ConfigDAO());
		return this.getBuilder().build();
	}
	
	protected Config setConfig(Map<String, Object> config) {
		String type = null;
		
		for (Map.Entry<String, Object> param : config.entrySet()) {
			if (param.getKey().equals("type"))
				type = (String)param.getValue();
			if (param.getKey().equals("value") && type != null)
				return new Config(type, (String)param.getValue());
			if (param.getKey().equals("currencies"))
				return new Config((Currency[])param.getValue());
		}
		return null;
	}
	
	protected Config setConfig(String config) {
		// use gson converter
		return new Config();
	}
}
