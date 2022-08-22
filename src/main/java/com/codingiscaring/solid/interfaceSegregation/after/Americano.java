package com.codingiscaring.solid.interfaceSegregation.after;

public class Americano implements CoffeeMachine {

    @Override
    public void addCoffee() {
    }

    public void makeAmericano() {
        addCoffee();
        System.out.println("Americano");
    }

}
