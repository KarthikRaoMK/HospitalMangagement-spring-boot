package com.example.hospitalmangement.entity;

import com.example.hospitalmangement.repository.Patientrepository;
import com.example.hospitalmangement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;

public class UserService {
    @Autowired
    private UserRepository repository;
    public User saveUser(UserRequest userrequest){
        return repository.save(userrequest);

    }
}
