package com.ironhack.animalsearchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AnimalSearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalSearchServiceApplication.class, args);
	}

}
