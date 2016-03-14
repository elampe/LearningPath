package com.example.henry_light.learningpass;

public class User {

    String name, username, password;
    int age;
    int skill;
    int preferences;

    public User(String name, int age, String username, String password) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
        this.skill = skill;
        this.preferences = preferences;
    }

    public User(String username, String password) {
        this("", -1, username, password);
    }
}
