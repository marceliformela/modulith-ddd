package com.example.library.catalog.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Car {

    @EmbeddedId
    private CarId id;
    private String modelName;
    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "plate"))
    private Plate plate;

    public Car(String modelName, Plate plate) {
        this.id = new CarId();
        this.modelName = modelName;
        this.plate = plate;
    }

    public Car() {
    }

    public CarId getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public Plate getPlate() {
        return plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
