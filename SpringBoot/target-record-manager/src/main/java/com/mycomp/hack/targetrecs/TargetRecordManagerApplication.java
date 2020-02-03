package com.mycomp.hack.targetrecs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.mycomp.hack.targetrecs.repository")
public class TargetRecordManagerApplication {

	private static final Logger LOGGER = LogManager.getLogger(TargetRecordManagerApplication.class);

	public static void main(String[] args) {
		
        LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
		SpringApplication.run(TargetRecordManagerApplication.class, args);
	}
}
