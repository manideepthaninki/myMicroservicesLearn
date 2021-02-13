package com.mdmilkShakes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.mdmilkShakes.*")
@EnableMongoRepositories
public class MdMilkShakesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdMilkShakesApplication.class, args);
	}

	
	
}
