package com.example.library.lending.domain;

import java.util.UUID;

public record UserId(UUID id) {

    public UserId() {
        this(UUID.randomUUID());
    }
}
