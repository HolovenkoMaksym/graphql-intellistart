package com.holovenko.graphqlintellistart.controller;

import com.holovenko.graphqlintellistart.dto.CountryDto;
import com.holovenko.graphqlintellistart.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    @GetMapping
    public List<CountryDto> getAllCountries() {
        return countryService.getAll();
    }

    @GetMapping("/{id}")
    public CountryDto getCountryById(@PathVariable Long id) {
        return countryService.getById(id);
    }
}
