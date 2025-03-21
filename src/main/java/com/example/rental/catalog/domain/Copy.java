package com.example.rental.catalog.domain;

import jakarta.persistence.*;

@Entity
public class Copy {

    @EmbeddedId
    private CopyId id;

    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "book_id"))
    private CarId carId;

    @Embedded
    private BarCode barCode;

    public Copy() {
    }

    public Copy(CarId carId, BarCode barCode) {
        this.id = new CopyId();
        this.carId = carId;
        this.barCode = barCode;
    }
}
