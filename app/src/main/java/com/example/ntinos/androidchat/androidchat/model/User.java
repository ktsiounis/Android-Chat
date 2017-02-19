package com.example.ntinos.androidchat.androidchat.model;

/**
 * Created by Konstantinos on 19/2/2017.
 */

public class User {
    public String username;
    public String firstName;
    public String lastName;

    public User(String firstName, String username, String lastName) {
        this.firstName = firstName;
        this.username = username;
        this.lastName = lastName;
    }
}
