package com.microservies.Controller;



import com.microservies.Entities.Users;
import com.microservies.Repository.UserRepo;
import com.microservies.Services.MainServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    private MainServices mainServices;

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/saveuser")
    public void saveUser(@RequestBody Users users){
        mainServices.saveuser(users);

    }

    @GetMapping("/getUserById/{id}")
    public Optional<Users> findUsersById(@PathVariable int id){
       return mainServices.findUserbyId(id);
    }

    @GetMapping("/getAllUsers")
    public List<Users> findAllUsers(){
       return  mainServices.findallusers();
    }
}
