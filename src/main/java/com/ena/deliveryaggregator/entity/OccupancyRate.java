package com.ena.deliveryaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "occupancy_rate")
@NoArgsConstructor
@AllArgsConstructor
public class OccupancyRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "city")
    private Integer cityId;

    @Column(name = "dayy")
    private Date date;

    @Column(name = "max_count")
    private Integer maxCount;

    @Column(name = "current_count")
    private Integer currentCount;
}
