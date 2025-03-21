package com.example.library.lending.domain;

import java.io.Serializable;
import java.util.UUID;

public record LoanId(UUID id) implements Serializable {

    public LoanId() {
        this(UUID.randomUUID());
    }
}
