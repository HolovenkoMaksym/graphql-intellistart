package com.holovenko.graphqlintellistart.repository;

import com.holovenko.graphqlintellistart.entity.WeaponEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends JpaRepository<WeaponEntity, Long> {
}
