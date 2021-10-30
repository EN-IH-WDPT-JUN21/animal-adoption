package com.ironhack.animaladoption.edgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AnimalAdoptionEdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalAdoptionEdgeServiceApplication.class, args);
	}

}
