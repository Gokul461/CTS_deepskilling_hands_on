package com.country.orm_learn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.orm_learn.model.Country;
import com.country.orm_learn.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryService {

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

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
        logger.info("Saved Country: {}", country);
    }

    @Transactional
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
        logger.info("Deleted country with code: {}", code);
    }

    public Country getById(String code) {
        Country country = countryRepository.findById(code.toUpperCase()).orElse(null);
        if (country == null) {
            logger.warn("Country with code {} not found!", code);
        } else {
            logger.info("Fetched country: {}", country.getName());
        }
        return country;
    }
}
