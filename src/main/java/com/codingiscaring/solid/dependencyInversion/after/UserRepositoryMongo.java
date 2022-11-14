package com.codingiscaring.solid.dependencyInversion.after;

public class UserRepositoryMongo implements UserRepository{
    public User findByName(String name) {
        // method that calls the Mongo DB
        return new User();
    }
}
