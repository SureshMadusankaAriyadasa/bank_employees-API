package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankEmployeesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankEmployeesApplication.class, args);
		System.out.println("=======================================================================");
		System.out.println("Hello, Welcome to Bank Employees System");
		System.out.println("=======================================================================");
	}

}
