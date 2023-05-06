package com.geekster.UniversityManagementSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int StudentId;
    @Pattern(regexp = "(^|\\\\s)[A-Z][a-z]*")
    private String firstName;
    @Pattern(regexp = "(^|\\\\s)[A-Z][a-z]*")
    private String lastName;
    @Pattern(regexp = "(1[89]|[2-9][0-9])")
    private int age;
    @Enumerated(EnumType.STRING)
    private Department department;


}
