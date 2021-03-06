package log4jProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jProjectDemoApplication {

	static Logger  logger=LogManager.getLogger(Log4jProjectDemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Log4jProjectDemoApplication.class, args);
		
		System.out.println("Hello..........");
		
		//level 
		//ALL >TRACE > DEBUGG > INFO > WARN > ERROR > FATAL>OF
		logger.trace("This is an trace msg");
		logger.debug("This is an debug msg");
		logger.info("This is an info msg");
		logger.warn("This is an warn msg");
		logger.error("This is an error msg");
		logger.fatal("This is an fatal msg");
		
	}

}
