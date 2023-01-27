package com.holovenko.graphqlintellistart.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class SupplyId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "weapon_id")
    private WeaponEntity weapon;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private CountryEntity country;
}
