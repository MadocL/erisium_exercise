package com.example.erisium_exercise.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class Owner {
    @Id
    private int idOwner;
    private String name;
    @OneToMany(mappedBy="owner")
    @JsonManagedReference
    private List<Cat> cats;

    public Owner(){
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
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
        return "Owner{" +
                "idOwner=" + idOwner +
                ", name='" + name + '\'' +
                ", cats=" + cats +
                '}';
    }
}