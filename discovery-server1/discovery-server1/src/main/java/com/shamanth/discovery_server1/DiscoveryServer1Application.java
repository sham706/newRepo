package com.shamanth.discovery_server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServer1Application.class, args);
	}

}
