package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	
	//Create an instance for the Logger class
	//We create a logger for that particular class
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		
		System.out.println("\n Hello World....!   \n");
		
		logger.trace("This is a trace message");
		
		logger.info("This is information message");
		logger.warn("This is an warning message");
		logger.error("This is an error message");
		logger.fatal("This is an fatal message");
		
		System.out.println("\n Completed");



	}

}
