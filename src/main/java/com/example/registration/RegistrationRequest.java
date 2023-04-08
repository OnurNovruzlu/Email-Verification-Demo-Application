package com.example.registration;

import org.hibernate.annotations.NaturalId;

public record RegistrationRequest(
            String first_name,
            String last_name,
            String email,
            String password,
            String role) {
}
