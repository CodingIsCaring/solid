package com.codingiscaring.solid.interfaceSegregation.after;

public class Barraquito implements CoffeeMachine, Milk, CanaryCustom {
    @Override
    public void addCoffee() {

    }

    @Override
    public void addLemonSkin() {

    }

    @Override
    public void addCoffeeBean() {

    }

    @Override
    public void addATrickleOfLiqueur() {

    }

    @Override
    public void addCinnamon() {

    }

    @Override
    public void addMilk() {

    }

    @Override
    public void addCondensedMilk() {

    }

    public void makeBarraquito() {
        addCondensedMilk();
        addATrickleOfLiqueur();
        addMilk();
        addCoffee();
        addLemonSkin();
        addCinnamon();
        addCoffeeBean();
        System.out.println("Barraquito");
    }
}
