package com.holovenko.graphqlintellistart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "weapons")
public class WeaponEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "weapons_seq")
    @SequenceGenerator(name = "weapons_seq", sequenceName = "weapons_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private WeaponType type;

    @OneToMany(mappedBy = "supplyId.weapon")
    private List<SupplyEntity> supplies;
}
