package com.example.springboottrainning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class SpringBootTrainningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTrainningApplication.class, args);
	}

}
