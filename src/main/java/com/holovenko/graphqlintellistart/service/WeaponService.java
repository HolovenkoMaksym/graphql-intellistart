package com.holovenko.graphqlintellistart.service;

import com.holovenko.graphqlintellistart.dto.WeaponDto;

import java.util.List;

public interface WeaponService {
    List<WeaponDto> getAll();
    WeaponDto getById(Long id);
}
