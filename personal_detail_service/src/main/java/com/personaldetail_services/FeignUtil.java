package com.personaldetail_services;


import com.personaldetail_services.Entities.PersonalDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;


@FeignClient(value = "feignclientdemo",url = "http://localhost:8080/microservices")
public interface FeignUtil {
    @GetMapping("detailbyid/{id}")
    public Optional<PersonalDetails> getAllPersonalDetailById(int id);
}
