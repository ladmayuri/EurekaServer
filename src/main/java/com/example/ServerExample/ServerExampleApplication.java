package com.example.ServerExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerExampleApplication.class, args);
	}

}
