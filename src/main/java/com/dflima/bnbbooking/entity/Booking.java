package com.dflima.bnbbooking.entity;

import java.util.Date;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Getter
    public UUID id;

    @Column(nullable = false)
    @Getter
    @Setter
    public String code;

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    @Getter
    @Setter
    public Date startDate;

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    @Getter
    @Setter
    public Date endDate;
}
