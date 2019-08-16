package com.crosscheck.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/META-INF/spring/integration/provision-user/provision-user-gateway.xml")
public class CrosscheckIntegrationMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrosscheckIntegrationMavenApplication.class, args);
	}

}
