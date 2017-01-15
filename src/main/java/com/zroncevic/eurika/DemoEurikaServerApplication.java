package com.zroncevic.eurika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoEurikaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurikaServerApplication.class, args);
	}
}
