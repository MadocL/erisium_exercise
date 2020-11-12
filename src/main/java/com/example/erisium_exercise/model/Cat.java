package com.example.erisium_exercise.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;

@Entity
public class Cat {
    @Id
    private int idCat;
    private String color;
    private String name;

    @ManyToOne
    @JoinColumn(name="idBreed")
    @JsonManagedReference
    private Breed breed;

    @ManyToOne
    @JoinColumn(name="idOwner")
    @JsonBackReference
    private Owner owner;

    public Cat(){
    }

    public Cat(int idCat, String color, String name) {
        this.idCat = idCat;
        this.color = color;
        this.name = name;
        this.breed = breed;
        this.owner = owner;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "idCat=" + idCat +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", breed=" + breed +
                ", owner=" + owner +
                '}';
    }
}