package com.personaldetail_services.Repository;

import com.personaldetail_services.Entities.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Repository
public interface DetailRepo extends JpaRepository<PersonalDetails, Integer> {

}
