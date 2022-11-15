package com.jay.TwitterClone.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jay.TwitterClone.models.Comment;

public interface CommentsRepository extends CrudRepository <Comment, Long> {
    
}
