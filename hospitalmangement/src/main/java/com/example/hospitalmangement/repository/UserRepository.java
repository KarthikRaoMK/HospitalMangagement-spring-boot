package com.example.hospitalmangement.repository;

import com.example.hospitalmangement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

