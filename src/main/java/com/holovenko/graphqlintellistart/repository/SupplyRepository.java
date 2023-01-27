package com.holovenko.graphqlintellistart.repository;

import com.holovenko.graphqlintellistart.entity.SupplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplyRepository extends JpaRepository<SupplyEntity, Long> {
}
