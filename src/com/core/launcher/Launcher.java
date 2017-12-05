package com.core.launcher;

import com.core.app.IApplication;

public class Launcher {
	
	public IApplication[] apps = null;

	public Launcher(IApplication[] app) {
		this.setApp(app);
		this.run();
	}
	
	public boolean set() {
		return false;
	}

	public boolean run() {
		for (IApplication app : this.getApp()) {
			if (!app.run())
				return false;
		}
		return true;
	}

	public IApplication[] getApp() {
		return this.apps;
	}

	public void setApp(IApplication[] app) {
		this.apps = app;
	}
}
