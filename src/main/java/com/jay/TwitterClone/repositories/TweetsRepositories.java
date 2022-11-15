package com.jay.TwitterClone.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jay.TwitterClone.models.Tweet;

public interface TweetsRepositories extends CrudRepository <Tweet, Long> {
    
}
