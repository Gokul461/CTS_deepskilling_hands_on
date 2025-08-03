package com.country.orm_learn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.country.orm_learn.model.Country;
import com.country.orm_learn.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> fetchCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping
    public void addCountry(@RequestBody Country country) {
        countryService.addCountry(country);
    }

    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable String code) {
        countryService.deleteCountry(code);
    }

    @GetMapping("/{code}")  // ✅ Corrected this line
    public ResponseEntity<Country> getCountry(@PathVariable String code) {
        Country country = countryService.getById(code.toUpperCase());
        if (country == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(country); 
    }
}
