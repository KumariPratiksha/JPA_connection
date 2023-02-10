package com.example.sql_first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
@Autowired
    UserRepository userrepository;
public String addUser(User user){
    System.out.println(userrepository.save(user));
    return " User added ";
}
public User getUser(int id){
    User user = userrepository.findById(id).get();
    return user;
}

public List getAllUser(){
    List user = userrepository.findAll();
    return user;
}
}
