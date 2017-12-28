package com.accolite.au.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("DemoAppContextListener # contextInitialized # invoked");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("DemoAppContextListener # contextDestroyed # invoked");
	}

}
