package com.example.erisium_exercise.dao;

import com.example.erisium_exercise.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerDao extends JpaRepository<Owner, Integer> {
    Owner findById(int id);
}