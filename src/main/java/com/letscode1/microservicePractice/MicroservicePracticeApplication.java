package com.letscode1.microservicePractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching
public class MicroservicePracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicePracticeApplication.class, args);
	}

}
