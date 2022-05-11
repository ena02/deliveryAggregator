package com.ena.deliveryaggregator.repo;

import com.ena.deliveryaggregator.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Integer> {

    @Query("SELECT s FROM Slot s WHERE" +
            " (s.currentOrder < s.maxOrder)")
    List<Slot> findAllEmptySlots();

    @Query("SELECT s FROM Slot s WHERE" +
            " s.startTime < :time AND s.entTime < :time AND s.cityId = :cityId" )
    List<Slot> freeSlotByDate(@Param("cityId") Integer cityId, @Param("time") Timestamp time);
}
