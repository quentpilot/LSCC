package com.engine.factory;

import com.engine.builder.IBuilder;

public class Factory implements IFactory {

	public Factory() {}
	
	public static IBuilder builder(String classname) {
		String path = "/";
		path = path + classname + ".java";
		return null;
	}
}
