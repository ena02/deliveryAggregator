package com.ena.deliveryaggregator.service;

import com.ena.deliveryaggregator.entity.OccupancyRate;
import com.ena.deliveryaggregator.entity.Slot;
import com.ena.deliveryaggregator.repo.OccupancyRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class OccupancyRateService {


    private OccupancyRateRepository occupancyRateRepository;

    public OccupancyRateService(OccupancyRateRepository occupancyRateRepository) {
        this.occupancyRateRepository = occupancyRateRepository;
    }

    /*public Slot findAFreeSlot(Date date) {
        return null;
    }*/

    public List<OccupancyRate> findAll() {
        return occupancyRateRepository.findAll();
    }


}
