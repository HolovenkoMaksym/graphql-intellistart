package com.holovenko.graphqlintellistart.dto;

import com.holovenko.graphqlintellistart.entity.WeaponType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeaponDto {
    private Long id;
    private String name;
    private WeaponType type;
}
