package com.example.rental.catalog.domain;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, CarId> {
}
