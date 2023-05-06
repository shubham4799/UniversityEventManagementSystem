package com.geekster.UniversityManagementSystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventId;
    private String eventName;
    private String locationOfEvent;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

}
