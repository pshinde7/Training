package com.test.gradel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class is for initiating Spring Boot applications.
 * Spring looks for this line to start Spring boot applications.
 * @author Prashant Shinde
 *
 */
@SpringBootApplication
public class SpringApplicationMain {
	 public static void main(final String[] args) throws Exception {
	        SpringApplication.run(SpringApplicationMain.class, args);
	    }
}
