package com.codingiscaring.solid.liskovSubstitution.animals.goodExample;


public class Main {

    public void main() {}

    public void move(LightweightAnimal animal) {
        animal.walk();
        animal.jump();
    }
}