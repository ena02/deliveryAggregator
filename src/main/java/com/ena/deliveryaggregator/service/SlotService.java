package com.ena.deliveryaggregator.service;

import com.ena.deliveryaggregator.entity.Slot;
import com.ena.deliveryaggregator.repo.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class SlotService {

    private final SlotRepository slotRepository;

    public SlotService(SlotRepository slotRepository) {
        this.slotRepository = slotRepository;
    }

    public List<Slot> findAll() {
        return slotRepository.findAll();
    };

    public Slot add(Slot slot) {
        return slotRepository.save(slot);
    }

    public Slot update(Slot slot) {
        return slotRepository.save(slot);
    }

    public List<Slot> findAllEmptySlots() {
        return slotRepository.findAllEmptySlots();
    }


    public List<Slot> freeSlotByDate(Integer cityId, Timestamp date) {
        return slotRepository.freeSlotByDate(cityId, date);
    }

}
