package com.codingiscaring.solid.dependencyInversion.after;

public interface UserRepository {
    User findByName(String name);
}
