package com.example.rental.catalog.domain;

import java.util.UUID;

public record CarId(UUID id) {

    public CarId() {
        this(UUID.randomUUID());
    }
}
