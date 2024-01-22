package com.dflima.bnbbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dflima.bnbbooking.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    
}
