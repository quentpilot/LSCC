package com.core.app;

import com.engine.builder.IBuilder;
import com.engine.builder.pojo.Config;
import com.engine.factory.IFactory;

public interface IApplication {
	
	public boolean build();
	public boolean run();
	
	public String[] getOptions();
	public void setOptions(String[] options);
	
	public IFactory getFactory();
	public void setFactory(IFactory factory);
	
	public IBuilder getBuilder();
	public void setBuilder(IBuilder builder);
	
	public Config getConfig();
	public void setConfig(Config builder);
}
