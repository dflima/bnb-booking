package com.dflima.bnbbooking.entity;

import java.util.Date;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "blocks")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Getter
    private UUID id;

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
