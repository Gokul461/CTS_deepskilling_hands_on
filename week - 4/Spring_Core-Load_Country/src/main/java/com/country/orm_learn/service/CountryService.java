package com.country.orm_learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.orm_learn.model.Country;
import com.country.orm_learn.repository.CountryRepository;

import java.util.List;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CountryService {

    // Step 1: Create a logger instance
    private static final Logger logger = LoggerFactory.getLogger(CountryService.class);

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        List<Country> countries = countryRepository.findAll();
        if (countries.isEmpty()) {
            logger.warn("No countries found in the database.");
        } else {
            logger.info("The countries are:");
            for (Country c : countries) {
                logger.info("{}", c); 
            }
        }

        return countries;
    }

	public void addCountry(Country country) {
	    countryRepository.save(country);
	    logger.info("Saved Country: " + country);
	}
	public void deleteCountry(String code) {
	    countryRepository.deleteById(code);
	    logger.info("Deleted country with code: " + code);
	}


}
