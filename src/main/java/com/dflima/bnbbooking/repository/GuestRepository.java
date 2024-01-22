package com.dflima.bnbbooking.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dflima.bnbbooking.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, UUID> {
}
