package com.bridge.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DesafioBridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBridgeApplication.class, args);
	}

}
