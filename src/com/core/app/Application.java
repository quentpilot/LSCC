package com.core.app;

import com.engine.builder.IBuilder;
import com.engine.builder.pojo.Config;
import com.engine.factory.IFactory;

public abstract class Application implements IApplication {

	protected String[] options = null;
	protected IFactory factory = null;
	protected IBuilder builder = null;
	protected Config config = null;
	
	public abstract boolean build();
	
	public boolean run() {
		if (!this.build())
			return false;
		return true;
	}
	
	public String[] getOptions() { return this.options; }
	public void setOptions(String[] options) { this.options = options; }
	
	public IFactory getFactory() { return this.factory; }
	public void setFactory(IFactory factory) { this.factory = factory; }
	
	public IBuilder getBuilder() { return this.builder; }
	public void setBuilder(IBuilder builder) { this.builder = builder; }
	
	public Config getConfig() { return this.config; }
	public void setConfig(Config config) { this.config = config; }
	
}
