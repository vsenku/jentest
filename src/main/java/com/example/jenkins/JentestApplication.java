package com.example.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JentestApplication {
	
public static Logger logger = LoggerFactory.getLogger(JentestApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Initiated......");
		logger.info("Application stated..")
	}

	public static void main(String[] args) {
		
		SpringApplication.run(JentestApplication.class, args);
	}

}
