package com.technical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication

@EnableAutoConfiguration
@EnableWebMvc 
public class TechnicalDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(TechnicalDemo1Application.class, args);
		System.out.println("Technical App iis Running... ");
	}
   
}
