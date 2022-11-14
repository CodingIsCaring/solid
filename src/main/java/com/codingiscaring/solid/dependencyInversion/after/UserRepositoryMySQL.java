package com.codingiscaring.solid.dependencyInversion.after;

public class UserRepositoryMySQL implements UserRepository {

    public User findByName(String name) {
        // method that calls the DB by a SQL query
        return new User();
    }

}
