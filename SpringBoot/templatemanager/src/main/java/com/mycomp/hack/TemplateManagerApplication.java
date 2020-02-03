package com.mycomp.hack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.mycomp.hack.repository")

public class TemplateManagerApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(TemplateManagerApplication.class);

	public static void main(String[] args) {
		
        LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
		SpringApplication.run(TemplateManagerApplication.class, args);
	}

}
