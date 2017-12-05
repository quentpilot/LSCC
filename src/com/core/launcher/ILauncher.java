package com.core.launcher;

import com.core.app.IApplication;

public interface ILauncher {
	
	public boolean set();
	public boolean run();
	
	public IApplication[] getApp();
	public void setApp(IApplication[] app);
}
