package com.project.sacan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.project.sacan")
@SpringBootApplication
public class SacanApplication {
private static Logger logger = LoggerFactory.getLogger(SacanApplication.class);
	public static void main(String[] args) {
		if(logger.isDebugEnabled()) {
			logger.debug(SacanApplication.class + "Server get started with no error");
		}
		SpringApplication.run(SacanApplication.class, args);
	}
}
