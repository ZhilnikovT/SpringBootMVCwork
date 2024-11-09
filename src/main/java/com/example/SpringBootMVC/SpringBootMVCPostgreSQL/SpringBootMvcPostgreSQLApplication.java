package com.example.SpringBootMVC.SpringBootMVCPostgreSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.SpringBootMVC.SpringBootMVCPostgreSQL", "com.example.SpringBootMVC.model"})

public class SpringBootMvcPostgreSQLApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcPostgreSQLApplication.class, args);
	}

}
