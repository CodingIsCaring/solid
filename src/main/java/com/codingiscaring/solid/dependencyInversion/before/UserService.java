package com.codingiscaring.solid.dependencyInversion.before;

public class UserService {

    private UserRepositoryMySQL userRepositoryMySQL;

    public UserService(UserRepositoryMySQL userRepositoryMySQL) {
        this.userRepositoryMySQL = userRepositoryMySQL;
    }

    public User findByName(String name) {
        return userRepositoryMySQL.findByName(name);
    }

}
