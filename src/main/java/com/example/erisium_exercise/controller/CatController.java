package com.example.erisium_exercise.controller;

import com.example.erisium_exercise.dao.CatDao;
import com.example.erisium_exercise.model.Cat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Chats")
@RestController
public class CatController {
    @Autowired
    private CatDao catDao;

    @ApiOperation(value = "Liste tous les chats")
    @GetMapping(value = "/cats")
    public List<Cat> listCats(){
        return catDao.findAll();
    }

    @ApiOperation(value = "Retourne un chat selon l'ID donné")
    @GetMapping(value = "/cats/{id}")
    public Cat getCat(@PathVariable int id){
        return catDao.findById(id);
    }

    @ApiOperation(value = "Remplace le chat par celui donné, si l'ID ne correspond à aucun : une nouvelle ressource est créée")
    @PutMapping(value = "/cats")
    public void updateCat(@RequestBody Cat cat){
        catDao.save(cat);
    }

    @ApiOperation(value = "Supprime un chat selon l'ID donné")
    @DeleteMapping(value = "/cats/{id}")
    public void deleteCat(@PathVariable int id) {
        catDao.deleteById(id);
    }

    @ApiOperation(value = "Modifie partiellement un chat selon l'ID donné")
    @PatchMapping(value = "/cats/{id}")
    public void partialUpdateCat(@RequestBody Cat cat, @PathVariable int id){
        catDao.save(cat);
    }
}
