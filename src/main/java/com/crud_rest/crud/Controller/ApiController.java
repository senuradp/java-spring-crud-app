package com.crud_rest.crud.Controller;

import com.crud_rest.crud.Models.User;
import com.crud_rest.crud.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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



}
