package com.boot.learn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.boot.learn")
@EnableJpaRepositories(basePackages = "com.boot.learn.*")
@EntityScan(basePackages = "com.boot.learn.*")
public class SpringBootJpaMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaMySqlApplication.class, args);
	}
}
