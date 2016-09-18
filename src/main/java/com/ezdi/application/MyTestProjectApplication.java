package com.ezdi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ezdi")
public class MyTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTestProjectApplication.class, args);
	}
}
