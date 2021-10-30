package com.ironhack.animalsearchservice.repositories;

import com.ironhack.animalsearchservice.dao.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findByType(String type);
    List<Animal> findByAgeBetween(Long age1, Long age2);

    @Query(value = "SELECT a FROM Animal a WHERE a.available = true")
    List<Animal> findAvailableAnimals();

    @Query(value = "SELECT a FROM Animal a WHERE a.available = true AND a.type = :type")
    List<Animal> findAvailableAnimalsByType(@Param("type") String type);

    @Query(value = "SELECT a FROM Animal a WHERE a.available = true AND a.age BETWEEN :ageFrom AND :ageTo ")
    List<Animal> findAvailableAnimalsAgeBetween(@Param("ageFrom") Long ageFrom, @Param("ageTo") Long ageTo);

}
