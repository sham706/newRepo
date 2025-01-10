package com.shamanth.Movie_Catalogue_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieCatalogueServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogueServicesApplication.class, args);
	}

}
