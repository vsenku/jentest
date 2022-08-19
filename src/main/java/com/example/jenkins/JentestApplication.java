package com.example.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JentestApplication {
	
public static Logger logger = LoggerFactory.getLogger(JentestApplication.class);
	
	
	public void init() {
		logger.info("Application Initiated......");
	}

	public static void main(String[] args) {
		logger.info("Application stated..");
		SpringApplication.run(JentestApplication.class, args);
	}

}
