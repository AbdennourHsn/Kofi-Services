package com.fstt.kofi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.fstt.kofi.entities")
@EnableJpaRepositories(basePackages = "com.fstt.kofi.repositories")
@ComponentScan(basePackages = {"com.fstt.kofi.services" , "com.fstt.kofi.controllers"})
public class ShopeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopeServiceApplication.class, args);
	}

}
