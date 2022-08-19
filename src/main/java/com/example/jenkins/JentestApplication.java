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
	}

	public static void main(String[] args) {
		logger.info("Application stated..");
		SpringApplication.run(JentestApplication.class, args);
	}

}
