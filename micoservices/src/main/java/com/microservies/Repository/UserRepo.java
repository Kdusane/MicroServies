package com.microservies.Repository;

import com.microservies.Entities.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    public Users findUserbyId(int id);

    public Users saveuser(User user);

    public List<Users> findallusers();

}
