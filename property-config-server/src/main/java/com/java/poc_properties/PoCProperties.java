package com.java.poc_properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PoCProperties {

	public static void main(String[] args) {
		SpringApplication.run(PoCProperties.class, args);
	}
}