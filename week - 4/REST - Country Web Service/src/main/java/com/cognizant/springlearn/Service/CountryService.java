package com.cognizant.springlearn.Service;

import com.cognizant.spring_learn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private ApplicationContext context;

    public Country getCountryIndia() {
        return (Country) context.getBean("countryIndia");
    }
}
