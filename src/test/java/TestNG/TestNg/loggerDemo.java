package TestNG.TestNg;
import org.apache.logging.log4j.*;
import org.testng.annotations.*;

public class loggerDemo {
	
	@Test
	public void log()
	{
		Logger log = LogManager.getLogger("loggerDemo");
		System.out.println("Logger demo");
		log.info("For info");
		log.debug("for debug");
		log.error("for error");
		log.warn("for warn");
	}

}
