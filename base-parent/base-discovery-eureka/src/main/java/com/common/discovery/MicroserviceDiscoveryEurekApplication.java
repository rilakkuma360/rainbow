package com.common.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEurekApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryEurekApplication.class, args);
	}
}
