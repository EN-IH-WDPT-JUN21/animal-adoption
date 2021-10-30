package com.Ironhack.miniadopterprojectadopter.repository;

import com.Ironhack.miniadopterprojectadopter.dao.Adopter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdopterRepository extends JpaRepository <Adopter, Long> {



}
