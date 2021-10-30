package com.ironhack.animalsearchservice.repositories;

import com.ironhack.animalsearchservice.dao.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findByType(String type);
    List<Animal> findByAgeBetween(Long age1, Long age2);

}
