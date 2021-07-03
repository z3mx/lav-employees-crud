package com.lavsystems.mongo.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * This is the main Class.
 * 
 * @author lantonio
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class CrudEmployeesApplication {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CrudEmployeesApplication.class, args);
	}

}
