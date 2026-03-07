package com.first.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.first.demo.service.Calculator;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	Calculator cal;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("main method called");


	}

}
