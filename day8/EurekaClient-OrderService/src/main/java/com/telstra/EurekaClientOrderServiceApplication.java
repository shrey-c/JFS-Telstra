package com.telstra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientOrderServiceApplication.class, args);
	}

}
