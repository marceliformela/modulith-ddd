package com.example.library.catalog.domain;

import java.io.Serializable;
import java.util.UUID;

public record BookId(UUID id) implements Serializable {

    public BookId() {
        this(UUID.randomUUID());
    }
}
