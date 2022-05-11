package com.ena.deliveryaggregator.repo;

import com.ena.deliveryaggregator.entity.OccupancyRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface OccupancyRateRepository extends JpaRepository<OccupancyRate, Integer> {
}
