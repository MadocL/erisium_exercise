package com.example.erisium_exercise.dao;

import com.example.erisium_exercise.model.Breed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreedDao extends JpaRepository<Breed,Integer> {
    Breed findById(int id);

    void deleteById(int id);
}
