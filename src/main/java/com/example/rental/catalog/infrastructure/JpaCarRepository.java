package com.example.rental.catalog.infrastructure;

import com.example.rental.catalog.domain.Car;
import com.example.rental.catalog.domain.CarRepository;
import org.springframework.stereotype.Component;

@Component
public class JpaCarRepository implements CarRepository {
    private final CarEntityRepository carEntityRepository;

    public JpaCarRepository(CarEntityRepository carEntityRepository) {
        this.carEntityRepository = carEntityRepository;
    }

    @Override
    public Car save(Car car) {
        CarEntity entity = new CarEntity(car.getId().id(), car.getModelName(), car.getPlate().value());
        carEntityRepository.save(entity);
        return car;
    }
}
