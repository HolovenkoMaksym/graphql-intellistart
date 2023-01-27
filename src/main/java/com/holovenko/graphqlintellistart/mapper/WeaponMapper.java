package com.holovenko.graphqlintellistart.mapper;

import com.holovenko.graphqlintellistart.dto.WeaponDto;
import com.holovenko.graphqlintellistart.entity.WeaponEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WeaponMapper {
    WeaponMapper INSTANCE = Mappers.getMapper(WeaponMapper.class);

    WeaponDto toDto(WeaponEntity entity);
}
