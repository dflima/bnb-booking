package com.dflima.bnbbooking.repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dflima.bnbbooking.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, UUID> {
    Optional<Booking> findOneByCode(String code);

    void deleteByCode(String code);
}
