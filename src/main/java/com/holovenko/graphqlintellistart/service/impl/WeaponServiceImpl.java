package com.holovenko.graphqlintellistart.service.impl;

import com.holovenko.graphqlintellistart.dto.WeaponDto;
import com.holovenko.graphqlintellistart.mapper.WeaponMapper;
import com.holovenko.graphqlintellistart.repository.WeaponRepository;
import com.holovenko.graphqlintellistart.service.WeaponService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WeaponServiceImpl implements WeaponService {

    private final WeaponRepository weaponRepository;

    @Override
    public List<WeaponDto> getAll() {
        return weaponRepository.findAll().stream()
                .map(WeaponMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public WeaponDto getById(Long id) {
        return weaponRepository.findById(id)
                .map(WeaponMapper.INSTANCE::toDto)
                .orElseThrow(() -> new IllegalArgumentException("Weapon with id " + id + " not found"));
    }
}
