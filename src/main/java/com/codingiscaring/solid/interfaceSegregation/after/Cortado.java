package com.codingiscaring.solid.interfaceSegregation.after;

public class Cortado implements CoffeeMachine, Milk {

    @Override
    public void addCoffee() {

    }

    @Override
    public void addMilk() {

    }

    @Override
    public void addCondensedMilk() {

    }

    void makeCoffeeWithMilk() {
        addCoffee();
        addMilk();
        System.out.println("CoffeeWithMilk");
    }

    void makeLecheYLeche() {
        addCoffee();
        addMilk();
        addCondensedMilk();
        System.out.println("LecheYLeche");
    }
}
