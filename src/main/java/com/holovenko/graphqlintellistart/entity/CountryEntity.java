package com.holovenko.graphqlintellistart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "countries")
public class CountryEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "countries_seq")
    @SequenceGenerator(name = "countries_seq", sequenceName = "countries_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "minister", unique = true, nullable = false)
    private String minister;

    @Column(name = "ukrainians_opinion", nullable = false)
    private String ukrainiansOpinion;

    @OneToMany(mappedBy = "supplyId.country")
    private List<SupplyEntity> supplies;
}
