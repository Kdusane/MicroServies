package com.liqubaseSetup.controller;


import com.liqubaseSetup.Entities.Persons;
import com.liqubaseSetup.Respository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/persons")
    public Persons createPerson(@RequestBody Persons persons){
        return personRepository.save(persons);
    }

    @GetMapping("/getAllPersons")
    public List<Persons> getAllPersons(){
        return personRepository.findAll();
    }

}
