package com.jay.TwitterClone.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jay.TwitterClone.models.User;

public interface UserRepository extends CrudRepository <User, Long> {
    
}
