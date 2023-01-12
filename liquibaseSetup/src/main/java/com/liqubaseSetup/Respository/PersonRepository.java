package com.liqubaseSetup.Respository;

import com.liqubaseSetup.Entities.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Persons, Integer> {
}
