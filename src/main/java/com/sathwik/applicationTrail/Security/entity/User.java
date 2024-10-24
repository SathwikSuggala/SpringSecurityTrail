package com.sathwik.applicationTrail.Security.entity;

import com.sathwik.applicationTrail.Security.dto.Gender;
import com.sathwik.applicationTrail.Security.dto.Role;
import com.sathwik.applicationTrail.Security.dto.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "users")  // This marks the class as a MongoDB document, with a collection named "users"
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id  // Primary key in MongoDB
    private String id;

    private String userName;
    private String password;
    private String email;
    private String mobileNumber;

    private Role role;  // Enum stored as string in MongoDB

    // Contact Info
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private Gender gender;  // Enum stored as string in MongoDB

    // Account info
    private AccountStatus accountStatus;  // Enum stored as string in MongoDB

    // Metadata
    @CreatedDate  // Automatically sets the creation date
    private LocalDateTime createdAt;

    @LastModifiedDate  // Automatically updates the modification date
    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
