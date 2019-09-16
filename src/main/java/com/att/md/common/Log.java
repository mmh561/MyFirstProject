package com.att.md.common;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	public static Logger log;
	
	public static Logger setUpLog() {
		log=Logger.getLogger("TestLogOutFunctionality");
		PropertyConfigurator.configure("Log4j.properties");
		return log;
	}

}
