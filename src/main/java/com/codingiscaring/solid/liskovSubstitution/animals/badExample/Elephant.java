package com.codingiscaring.solid.liskovSubstitution.animals.badExample;

public class Elephant extends Animal {

    public void jump() throws Exception {
        throw new Exception("");
    }
}
