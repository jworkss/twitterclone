package com.jay.TwitterClone.models;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String handle;

    @Column(nullable = false)
    private String password;

    public User() {
    }

    public User(String email, String handle, String password) {
        this.email = email;
        this.handle = handle;
        this.password = password;
    }

}
