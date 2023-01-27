package com.holovenko.graphqlintellistart.mapper;

import com.holovenko.graphqlintellistart.dto.CountryDto;
import com.holovenko.graphqlintellistart.dto.SupplyDto;
import com.holovenko.graphqlintellistart.dto.WeaponDto;
import com.holovenko.graphqlintellistart.entity.CountryEntity;
import com.holovenko.graphqlintellistart.entity.SupplyEntity;
import com.holovenko.graphqlintellistart.entity.SupplyId;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryDto toDto(CountryEntity entity);

    @Mapping(source = "supplyId", target = "weapon", qualifiedByName = "weaponDtoFromSupplyId")
    SupplyDto toDto(SupplyEntity supplyEntity);

    @Named("weaponDtoFromSupplyId")
    static WeaponDto weaponDtoFromSupplyId(SupplyId supplyId) {
        return WeaponMapper.INSTANCE.toDto(supplyId.getWeapon());
    }
}
