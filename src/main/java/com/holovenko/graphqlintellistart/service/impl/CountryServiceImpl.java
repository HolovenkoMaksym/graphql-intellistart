package com.holovenko.graphqlintellistart.service.impl;

import com.holovenko.graphqlintellistart.dto.CountryDto;
import com.holovenko.graphqlintellistart.dto.HelpDto;
import com.holovenko.graphqlintellistart.entity.CountryEntity;
import com.holovenko.graphqlintellistart.entity.SupplyEntity;
import com.holovenko.graphqlintellistart.mapper.CountryMapper;
import com.holovenko.graphqlintellistart.repository.CountryRepository;
import com.holovenko.graphqlintellistart.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Override
    public List<CountryDto> getAll() {
        return countryRepository.findAll().stream()
                .map(CountryMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CountryDto getById(Long id) {
        return countryRepository.findById(id)
                .map(CountryMapper.INSTANCE::toDto)
                .orElseThrow(() -> new IllegalArgumentException("Country with id " + id + " not found"));
    }

    @Override
    public HelpDto getHelpByCountryId(Long id) {
        final CountryEntity country = countryRepository.findById(id).get();
        final Integer weaponAmount = country.getSupplies().stream()
                .mapToInt(SupplyEntity::getAmount)
                .sum();
        return new HelpDto(country.getName(), weaponAmount);
    }
}
