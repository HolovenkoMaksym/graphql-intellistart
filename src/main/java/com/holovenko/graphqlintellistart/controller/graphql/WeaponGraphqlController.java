package com.holovenko.graphqlintellistart.controller.graphql;

import com.holovenko.graphqlintellistart.dto.WeaponDto;
import com.holovenko.graphqlintellistart.service.WeaponService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class WeaponGraphqlController {

    private final WeaponService weaponService;

    @QueryMapping
    public List<WeaponDto> weapons() {
        return weaponService.getAll();
    }
}
