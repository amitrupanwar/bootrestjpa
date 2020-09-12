package com.prac.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.prac.controller", "com.prac.service" })
@EntityScan(basePackages = "com.prac.model")
@EnableJpaRepositories(basePackages = "com.prac.repo")
public class BootrestjpaApplication { 

	public static void main(String[] args) {
		SpringApplication.run(BootrestjpaApplication.class, args);
	}

}
