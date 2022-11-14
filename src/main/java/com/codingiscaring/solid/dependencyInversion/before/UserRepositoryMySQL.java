package com.codingiscaring.solid.dependencyInversion.before;

public class UserRepositoryMySQL {

    public User findByName(String name) {
        // method that calls the DB by a SQL query
        return new User();
    }

}
