package com.dflima.bnbbooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dflima.bnbbooking.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> findOneByBookingCode(String code);
    void deleteByBookingCode(String code);
}
