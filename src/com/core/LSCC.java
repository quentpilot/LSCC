package com.core;

import com.core.app.IApplication;
import com.core.app.LiveCurrencyConverter;
import com.core.launcher.Launcher;
import com.engine.builder.pojo.Config;
import com.engine.builder.pojo.Currency;

public class LSCC { 
	
	public static void main(String[] options) {
		Currency[] cy = { new Currency(), new Currency("EUR", "0.845"), new Currency("GBP", "0.745") };
		Config params = new Config(cy);
		
		IApplication[] tolaunch = {new LiveCurrencyConverter(params)};
		new Launcher(tolaunch);
	}
}
