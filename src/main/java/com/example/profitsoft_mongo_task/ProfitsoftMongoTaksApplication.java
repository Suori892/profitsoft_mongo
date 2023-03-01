package com.example.profitsoft_mongo_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class ProfitsoftMongoTaksApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfitsoftMongoTaksApplication.class, args);
	}

}
