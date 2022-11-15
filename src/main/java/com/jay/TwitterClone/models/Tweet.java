package com.jay.TwitterClone.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tweets")
@Getter
@Setter
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid")
    private User user;

    @OneToMany(mappedBy = "tweet", orphanRemoval = true)
    private Set<Comment> comments = new HashSet<>();

    public Tweet(){

    }

    public Tweet(String content, User user) {
        this.content = content;
        this.user = user;
    }
    
}
