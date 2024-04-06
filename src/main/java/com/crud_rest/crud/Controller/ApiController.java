package com.crud_rest.crud.Controller;

import com.crud_rest.crud.Models.User;
import com.crud_rest.crud.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // notes that it is a rest control and has endpoints here
public class ApiController {

    @Autowired //dependency injection
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/get-users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }

    @PostMapping(value = "/save-user")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "User saved ! ...";
    }

    @PutMapping(value = "/update-user/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setAge(user.getAge());
        updatedUser.setOccupation(user.getOccupation());
        userRepo.save(updatedUser);
        return "User updated ! ...";
    }

}
