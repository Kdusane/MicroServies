package com.personaldetail_services.controller;

import com.personaldetail_services.Entities.PersonalDetails;
import com.personaldetail_services.Repository.DetailRepo;
import com.personaldetail_services.Services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private DetailRepo detailRepo;

    @Autowired
    private MainService mainService;

    @PostMapping("/savePersonalDetails")
    public void savedetails(@RequestBody PersonalDetails personalDetails){
        mainService.savePersonalDetails(personalDetails);
    }
    @GetMapping("/getAllPersonalDetails")
    public List<PersonalDetails> getAllByPersonalDetails(){
        return  mainService.getAllPersonalDetails();
    }

    @GetMapping("/getAllByPersonalDetailsByid/{id}")
    public Optional<PersonalDetails> getAllByPersonalDetailById(@PathVariable int id){
        return mainService.getAllPersonalDetailById(id);
    }


}
