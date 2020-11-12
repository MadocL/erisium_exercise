package com.example.erisium_exercise.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class Breed {
    @Id
    private int idBreed;
    private String name;

    @OneToMany(mappedBy="breed")
    @JsonBackReference
    private List<Cat> cats;

    public Breed(){
    }

    public Breed(int idBreed, String name) {
        this.idBreed = idBreed;
        this.name = name;
    }

    public int getIdBreed() {
        return idBreed;
    }

    public void setIdBreed(int idBreed) {
        this.idBreed = idBreed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "idBreed=" + idBreed +
                ", name='" + name + '\'' +
                ", cats=" + cats +
                '}';
    }
}