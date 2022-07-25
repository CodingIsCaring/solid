package com.codingiscaring.solid.liskovSubstitution.animals.goodExample;

public class Kangaroo implements Animal, LightweightAnimal {

    @Override
    public void walk() {
        System.out.println("I'm walking on sunshine, eh eh");
    }

    @Override
    public void jump() {
        System.out.println("I'm jumping like a kangaroo");
    }
}
