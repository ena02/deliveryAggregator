package com.ena.deliveryaggregator.controller;

import com.ena.deliveryaggregator.entity.OccupancyRate;
import com.ena.deliveryaggregator.entity.Order;
import com.ena.deliveryaggregator.entity.Slot;
import com.ena.deliveryaggregator.service.OccupancyRateService;
import com.ena.deliveryaggregator.service.SlotService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {


    private final SlotService slotService;

    public MainController(SlotService slotService) {
        this.slotService = slotService;
    }

    @GetMapping("/all")
    public List<Slot> findAll() {
        return slotService.findAll();
    }

    @GetMapping("/emptySlots")
    public List<Slot> findAllEmptySlots() {
        return slotService.findAllEmptySlots();
    }

    @PostMapping("/freeSlotsByDate")
    public List<Slot> freeSlotByDate(Integer cityId, Timestamp date) {
        return slotService.freeSlotByDate(cityId, date);
    }

}
