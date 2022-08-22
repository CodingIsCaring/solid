package com.codingiscaring.solid.interfaceSegregation.after;

public class Espresso implements CoffeeMachine {

    @Override
    public void addCoffee() {
    }

    public void makeEspresso() {
        addCoffee();
        System.out.println("Espresso");
    }

}
