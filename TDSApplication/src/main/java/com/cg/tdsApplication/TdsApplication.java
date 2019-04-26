package com.cg.tdsApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cg.tdsApplication.dto")
@ComponentScan("com.cg.tdsApplication.dao")
@ComponentScan("com.cg.tdsApplication.service")
@ComponentScan("com.cg.tdsApplication.controller")
@ComponentScan("com.cg.tdsApplication.userInterfaceExceptions")
@EntityScan(basePackages = {"com.cg.tdsApplication.dto"})
@SpringBootApplication
public class TdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TdsApplication.class, args);
	}

}
