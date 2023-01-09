package com.personaldetail_services.Services;

import com.personaldetail_services.Entities.PersonalDetails;

import java.util.List;
import java.util.Optional;

public interface MainService {

    public void savePersonalDetails(PersonalDetails personalDetails);
    public List<PersonalDetails> getAllPersonalDetails();
    public Optional<PersonalDetails> getAllPersonalDetailById(int id);

}
