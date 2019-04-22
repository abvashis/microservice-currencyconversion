package com.microservice.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyConversionService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionService1Application.class, args);
	}

}
