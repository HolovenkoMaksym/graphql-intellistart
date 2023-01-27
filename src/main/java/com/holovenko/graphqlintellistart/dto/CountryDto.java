package com.holovenko.graphqlintellistart.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto {
    private Long id;
    private String name;
    private String minister;
    private String ukrainiansOpinion;
    private List<SupplyDto> supplies;
}
