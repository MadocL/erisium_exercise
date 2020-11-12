package com.example.erisium_exercise.controller;

import com.example.erisium_exercise.dao.BreedDao;
import com.example.erisium_exercise.model.Breed;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Races de chat")
@RestController
public class BreedController {

    @Autowired
    private BreedDao breedDao;

    @ApiOperation(value = "Liste toutes les races")
    @GetMapping(value = "/breeds")
    public List<Breed> listBreeds(){
        return breedDao.findAll();
    }

    @ApiOperation(value = "Retourne une race de chat selon l'ID donné")
    @GetMapping(value = "/breeds/{id}")
    public Breed getBreed(@PathVariable int id){
        return breedDao.findById(id);
    }

    @ApiOperation(value = "Remplace la race par celle donnée, si l'ID ne correspond à aucune : une nouvelle ressource est créée")
    @PutMapping(value = "/breeds")
    public void updateBreed(@RequestBody Breed breed){
        breedDao.save(breed);
    }

    @ApiOperation(value = "Supprime une race selon l'ID donné")
    @DeleteMapping(value = "/breeds/{id}")
    public void deleteBreed(@PathVariable int id) {
        breedDao.deleteById(id);
    }

    @ApiOperation(value = "Modifie partiellement une race selon l'ID donné")
    @PatchMapping(value = "/breeds/{id}")
    public void partialUpdateBreed(@RequestBody Breed breed, @PathVariable int id){
        breedDao.save(breed);
    }
}
