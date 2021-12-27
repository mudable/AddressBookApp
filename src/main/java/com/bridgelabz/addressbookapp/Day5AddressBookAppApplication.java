package com.bridgelabz.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Day5AddressBookAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Day5AddressBookAppApplication.class, args);
		log.info("Address Book App Started in {} Environment", context.getEnvironment().getProperty("environment"));
		log.info("Address Book DB User is {} Environment",
				context.getEnvironment().getProperty("spring.datasource.username"));
	}
}
