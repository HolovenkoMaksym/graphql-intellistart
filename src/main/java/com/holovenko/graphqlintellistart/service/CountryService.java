package com.holovenko.graphqlintellistart.service;

import com.holovenko.graphqlintellistart.dto.CountryDto;
import com.holovenko.graphqlintellistart.dto.HelpDto;

import java.util.List;

public interface CountryService {
    List<CountryDto> getAll();
    CountryDto getById(Long id);
    HelpDto getHelpByCountryId(Long id);
}
