package com.example.erisium_exercise.controller;

import com.example.erisium_exercise.dao.OwnerDao;
import com.example.erisium_exercise.model.Cat;
import com.example.erisium_exercise.model.Owner;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags="Propriétaires de chat")
@RestController
public class OwnerController {
    @Autowired
    private OwnerDao ownerDao;

    @ApiOperation(value = "Liste tous les propriétaires")
    @GetMapping(value = "/owners")
    public List<Owner> listOwners(){
        return ownerDao.findAll();
    }

    @ApiOperation(value = "Retourne un propriétaire selon l'ID donné")
    @GetMapping(value = "/owners/{id}")
    public Owner getOwner(@PathVariable int id){
        return ownerDao.findById(id);
    }

    @ApiOperation(value = "Retourne les chats selon le propriétaire donné")
    @GetMapping(value = "/owners/{id}/cats")
    public List<Cat> getCats(@PathVariable int id){
        return ownerDao.getOne(id).getCats();
    }

    @ApiOperation(value = "Remplace le propriétaire par celui donné, si l'ID ne correspond à aucun : une nouvelle ressource est créée")
    @PutMapping(value = "/owners")
    public void updateOwner(@RequestBody Owner owner){
        ownerDao.save(owner);
    }

    @ApiOperation(value = "Supprime un propriétaire selon l'ID donné")
    @DeleteMapping(value = "/owners/{id}")
    public void deleteOwner(@PathVariable int id) {
        ownerDao.deleteById(id);
    }

    @ApiOperation(value = "Modifie partiellement un propriétaire selon l'ID donné")
    @PatchMapping(value = "/owners/{id}")
    public void partialUpdateOwner(@RequestBody Owner owner, @PathVariable int id){
        ownerDao.save(owner);
    }
}
