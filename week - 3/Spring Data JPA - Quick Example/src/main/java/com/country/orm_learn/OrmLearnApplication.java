package com.country.orm_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext; // ✅ Correct import

import com.country.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		CountryService countryService = context.getBean(CountryService.class);
		countryService.getAllCountries();  
	}
}
