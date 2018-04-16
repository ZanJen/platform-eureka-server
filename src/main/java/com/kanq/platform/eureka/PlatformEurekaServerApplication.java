package com.kanq.platform.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PlatformEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformEurekaServerApplication.class, args);
	}
}
