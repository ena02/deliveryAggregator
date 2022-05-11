package com.ena.deliveryaggregator.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "city_name")
    private String name;
}
