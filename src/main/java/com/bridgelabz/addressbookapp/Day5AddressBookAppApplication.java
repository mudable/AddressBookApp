package com.bridgelabz.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Day5AddressBookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day5AddressBookAppApplication.class, args);
		log.info("AddressBookApp  started");
	}

}
