package com.example.rental.catalog.domain;

public class Car {

    private CarId id;
    private String modelName;
    private Plate plate;

    public Car(String modelName, Plate plate) {
        this.id = new CarId();
        this.modelName = modelName;
        this.plate = plate;
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
}
