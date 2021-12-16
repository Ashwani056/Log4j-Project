package log4jProject.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import log4jProject.Log4jProjectDemoApplication;

@RestController
public class Controller {
	
	static Logger  logger=LogManager.getLogger(Log4jProjectDemoApplication.class);
	
	@GetMapping("JavaGenie")
	public String test()
	{
		logger.info("Controller executing....");
		return "Hello Java Genie";
	}
	
	

}
