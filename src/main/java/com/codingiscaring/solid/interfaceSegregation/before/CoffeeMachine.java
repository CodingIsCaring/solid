package com.codingiscaring.solid.interfaceSegregation.before;

public class CoffeeMachine {

    public void makeEspresso() {
        addCoffee();
        System.out.println("Espresso");
    }

    public void makeCoffeeWithMilk() {
        addCoffee();
        addMilk();
        System.out.println("CoffeeWithMilk");
    }

    public void makeAmericano() {
        addCoffee();
        addWater();
        System.out.println("Americano");
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

    public void makeLecheYLeche() {
        addCoffee();
        addMilk();
        addCondensedMilk();
        System.out.println("LecheYLeche");
    }

    public void makeCoffeeMilkOfTheWeather() {
        addCoffee();
        addMilk();
        addIceCubes();
        System.out.println("Coffee of the weather");
    }

    public void makeEspressoOfTheWeather() {
        addCoffee();
        addIceCubes();
        System.out.println("Coffee of the weather");
    }

    public void addCoffee() {}

    public void addMilk() {}

    public void addWater() {}

    public void addCondensedMilk() {}

    public void addLemonSkin() {}

    public void addCoffeeBean() {}

    public void addATrickleOfLiqueur() {}

    public void addIceCubes() {}

    public void addCinnamon() {}
}
