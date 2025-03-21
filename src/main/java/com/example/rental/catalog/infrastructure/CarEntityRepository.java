package com.example.rental.catalog.infrastructure;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CarEntityRepository extends CrudRepository<CarEntity, UUID> {
}
