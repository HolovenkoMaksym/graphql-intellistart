package com.holovenko.graphqlintellistart.controller;

import com.holovenko.graphqlintellistart.dto.WeaponDto;
import com.holovenko.graphqlintellistart.service.WeaponService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/weapons")
public class WeaponController {

    private final WeaponService weaponService;

    @GetMapping
    public List<WeaponDto> getAllWeapons() {
        return weaponService.getAll();
    }

    @GetMapping("/{id}")
    public WeaponDto getWeaponById(@PathVariable final Long id) {
        return weaponService.getById(id);
    }
}
