package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Log4jLib {
	
	@Test
	public void log(){
		Logger logger= Logger.getLogger("Log4jLib");
		PropertyConfigurator.configure("C:\\Users\\SIVAIAH\\workspace\\LearnAutomation\\log4j.properties");
		logger.debug("This is debug");
		logger.info("This is info");
		logger.warn("This is warn");
		logger.error("This is error");
		logger.fatal("This is fatal");
	}

}
