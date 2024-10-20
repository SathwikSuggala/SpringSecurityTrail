package com.sathwik.applicationTrail.Security.entity;

import com.sathwik.applicationTrail.Security.dto.Gender;
import com.sathwik.applicationTrail.Security.dto.Role;
import com.sathwik.applicationTrail.Security.dto.AccountStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;
    private String password;
    private String email;
    private String mobileNumber;

    @Enumerated(EnumType.STRING)
    private Role role;

    // Contact Info
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    // Account info
    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

    private LocalDate registrationDate;
    private LocalDate lastLogin;

    private boolean emailVerified;
    private boolean mobileVerified;

    // Social
    private String preferLanguage;
    private String timeZone;

    // Metadata
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    // Automatically set createdAt and updatedAt
    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();  // Automatically set createdAt when the entity is first persisted
        this.updatedAt = LocalDateTime.now();  // Initially set updatedAt to now
        this.registrationDate = LocalDate.now();  // Automatically set registrationDate
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();  // Automatically set updatedAt when the entity is updated
    }
}
