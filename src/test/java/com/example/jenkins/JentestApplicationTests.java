package com.example.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JentestApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(JentestApplicationTests.class);

	@Test
	void contextLoads() {
		
		logger.info("Test case started...");
		assertEquals(true, true);
	}

}
