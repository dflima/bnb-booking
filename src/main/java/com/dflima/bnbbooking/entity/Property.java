package com.dflima.bnbbooking.entity;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Getter
    public UUID id;
}
