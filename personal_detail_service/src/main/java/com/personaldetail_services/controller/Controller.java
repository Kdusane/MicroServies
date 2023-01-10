package com.personaldetail_services.controller;

import com.personaldetail_services.Entities.PersonalDetails;

import com.personaldetail_services.FeignUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personaldetails")
public class Controller {
   @Autowired
    private FeignUtil feignUtil;

   @GetMapping("/{id}")
    public Optional<PersonalDetails> getbyid(int id){
        return feignUtil.getAllPersonalDetailById(id);
    }

}
