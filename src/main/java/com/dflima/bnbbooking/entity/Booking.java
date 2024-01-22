package com.dflima.bnbbooking.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private long id;

    @Column(nullable = false)
    @Getter
    @Setter
    private String code;

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    @Getter
    @Setter
    private Date startDate;

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    @Getter
    @Setter
    private Date endDate;
}
