package com.ht.userservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    @Email
    @Column(unique = true)
    private String email;

    @NotNull
    private String nickname;

    @NotNull
    private LocalDate registrationDate;

    private byte[] profilePicture;

}