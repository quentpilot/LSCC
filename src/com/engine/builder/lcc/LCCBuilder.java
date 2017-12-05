package com.engine.builder.lcc;

import com.engine.builder.Builder;
import com.engine.builder.dao.IDAO;
import com.engine.builder.pojo.Config;
import com.engine.builder.pojo.Currency;
import com.engine.builder.pojo.IPOJO;
import com.engine.builder.pojo.Response;
import com.tools.converter.fromclass.Computer;

public class LCCBuilder extends Builder {

	protected  Computer converter = null;
	
	public LCCBuilder() {
		super();
	}
	
	public LCCBuilder(IDAO dao, Config pojo) {
		super(dao, pojo);
	}
	
	public boolean build() {
		if (this.getPojo() == null)
			return false;
		if (this.getDao() != null) {
			// check user validation
			// get each currency from repo, then compute result 
			this.getPojo().setPath("resources/transfert/request/currencies/");
			this.getDao().setPojo(this.getPojo());
			this.setResponse(this.getDao().get());
			return true;
		} else {
			// currencies are already store so check user validation
			// compute each currency object from USD as reference
			this.getPojo().setPath("resources/config/");
			if (!this.compute())
				return false;
			this.setResponse(new Response(this.getConverter().getTab()));
		}
		return false;
	}
	
	protected boolean compute() {
		this.setConverter(new Computer(this.getPojo().getCurrencies()));
		
		for (Currency data : this.getPojo().getCurrencies()) {
			System.out.print(data.getCountry());
			System.out.println(" => " + data.getValue());
		}
		return this.getConverter().run();
	}

	public Computer getConverter() {
		return converter;
	}

	public void setConverter(Computer converter) {
		this.converter = converter;
	}

	public void setPojo(IPOJO pojo) {}
}
