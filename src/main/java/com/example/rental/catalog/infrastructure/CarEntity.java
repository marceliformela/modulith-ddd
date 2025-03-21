package com.example.rental.catalog.infrastructure;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class CarEntity {

    @Id
    private UUID id;
    private String modelName;
    private String plate;

    public CarEntity() {
    }

    public CarEntity(UUID id, String modelName, String plate) {
        this.id = id;
        this.modelName = modelName;
        this.plate = plate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
