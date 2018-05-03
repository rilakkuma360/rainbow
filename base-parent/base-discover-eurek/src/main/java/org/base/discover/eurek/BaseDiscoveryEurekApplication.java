package org.base.discover.eurek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BaseDiscoveryEurekApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseDiscoveryEurekApplication.class, args);
	}
}
