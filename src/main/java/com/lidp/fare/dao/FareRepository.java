package com.lidp.fare.dao;

import java.time.Instant;
import java.util.Optional;

import com.lidp.fare.domain.Fare;
import com.lidp.fare.domain.FareId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// crud repository for storing and querying fares
@Repository
public interface FareRepository extends CrudRepository<Fare, Instant>
{
   Iterable<Fare> findAll();
   Optional<Fare> findById(Instant time);
   Fare save(Fare fare);
}
