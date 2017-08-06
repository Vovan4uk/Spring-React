package com.perepeliuk.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String nickname;
    private String email;

    public User() {
    }

    public User(String name, Integer age, String nickname, String email) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
        this.email = email;
    }
}
