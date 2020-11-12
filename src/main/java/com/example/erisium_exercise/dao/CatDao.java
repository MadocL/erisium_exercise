package com.example.erisium_exercise.dao;

import com.example.erisium_exercise.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatDao extends JpaRepository<Cat,Integer> {
    Cat findById(int id);

    void deleteById(int id);
}
