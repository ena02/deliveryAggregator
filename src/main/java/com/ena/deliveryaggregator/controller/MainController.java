package com.ena.deliveryaggregator.controller;

import com.ena.deliveryaggregator.entity.Slot;
import com.ena.deliveryaggregator.service.SlotService;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
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

    @PostMapping("/add")
    public void add(@RequestBody Slot slot) {
        slotService.add(slot);
    }

    @PutMapping("/update")
    public void update(@RequestBody Slot slot) {
        slotService.add(slot);
    }

    //если возращает пустой список, тогда слот пустой.
    //нужно создать слот через /add
    @PostMapping("/freeSlotsByDate")
    public List<Slot> freeSlotByDate(Integer cityId, Timestamp date) {
        return slotService.freeSlotByDate(cityId, date);
    }

}
