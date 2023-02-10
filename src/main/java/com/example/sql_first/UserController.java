package com.example.sql_first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userservice;
    @PostMapping("/add-user")
    public String addUser(@RequestBody User user){

        return userservice.addUser(user);

    }
    @GetMapping("/get-user")
    public User getUser(@RequestParam Integer id){
        return userservice.getUser(id);
    }
    @GetMapping("/get-alluser")
    public List getAllUser(){
        return userservice.getAllUser();
    }
}
