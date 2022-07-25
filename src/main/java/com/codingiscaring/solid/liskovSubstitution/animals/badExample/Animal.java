package com.codingiscaring.solid.liskovSubstitution.animals.badExample;

public class Animal {

    public void walk() {
        System.out.println("I'm walking on sunshine, eh eh");
    }

    public void jump() throws Exception {
        System.out.println("I'm jumping like a dog");
    }
}
