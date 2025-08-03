package com.cognizant.springlearn.Controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.springlearn.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping("/country")
    public Country getCountryIndia() {
        return countryService.getCountryIndia();
    }
}
