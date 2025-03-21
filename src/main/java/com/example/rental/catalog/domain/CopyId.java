package com.example.rental.catalog.domain;

import java.io.Serializable;
import java.util.UUID;

public record CopyId(UUID id) implements Serializable {

    public CopyId() {
        this(UUID.randomUUID());
    }
}
