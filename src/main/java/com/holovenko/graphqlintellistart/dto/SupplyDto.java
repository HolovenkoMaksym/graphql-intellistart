package com.holovenko.graphqlintellistart.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupplyDto {
    private WeaponDto weapon;
    private Integer amount;
}
