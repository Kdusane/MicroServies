package com.personaldetail_services.Services;

import com.personaldetail_services.Entities.PersonalDetails;
import com.personaldetail_services.Repository.DetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainServiceImpl implements MainService{

    @Autowired
    private DetailRepo detailRepo;

    @Override
    public void savePersonalDetails(PersonalDetails personalDetails) {
        detailRepo.save(personalDetails);
    }

    @Override
    public List<PersonalDetails> getAllPersonalDetails() {
        return detailRepo.findAll();
    }

    @Override
    public Optional<PersonalDetails> getAllPersonalDetailById(int id) {
        return detailRepo.findById(id);
    }
}
