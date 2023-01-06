package com.microservies.Services;

import com.microservies.Entities.Users;
import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface MainServices {
    public Optional<Users> findUserbyId(int id);

    public Users saveuser(Users users);

    public List<Users> findallusers();

}
