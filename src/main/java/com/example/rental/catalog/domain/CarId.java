package com.example.rental.catalog.domain;

import java.io.Serializable;
import java.util.UUID;

public record CarId(UUID id) implements Serializable {

    public CarId() {
        this(UUID.randomUUID());
    }
}
