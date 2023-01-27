package com.holovenko.graphqlintellistart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "supplies")
public class SupplyEntity implements Serializable {

    @EmbeddedId
    private SupplyId supplyId;

    @Column(name = "amount", nullable = false)
    private Integer amount;
}
