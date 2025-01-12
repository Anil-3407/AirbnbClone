package com.AirbnbClone.AirbnbClone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity@Data
@AllArgsConstructor@NoArgsConstructor
public class Booking {

    private Long id;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

    private LocalDate startDate;
    private LocalDate endDate;
}
