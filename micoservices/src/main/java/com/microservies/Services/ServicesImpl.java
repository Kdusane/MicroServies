package com.microservies.Services;

import com.microservies.Entities.Users;
import com.microservies.Repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesImpl implements MainServices{
    @Autowired
    private UserRepo userRepo;


    @Override
    public Optional<Users> findUserbyId(int id) {
        return userRepo.findById(id);

    }

    @Override
    public Users saveuser(Users users) {
        return userRepo.save(users);
    }

    @Override
    public List<Users> findallusers() {
        return userRepo.findAll();
    }
}
