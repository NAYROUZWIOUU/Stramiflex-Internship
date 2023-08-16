package com.tn.stramiflex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class StramiflexApplication {

	public static void main(String[] args) {
		SpringApplication.run(StramiflexApplication.class, args);
	}

}
