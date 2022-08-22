package com.codingiscaring.solid.interfaceSegregation.after;

public class CortadoOfTheWeather extends Cortado implements OfTheWeather{
    @Override
    public void addIceCubes() {

    }

    public void makeLecheYLecheOfTheWeather() {
        makeLecheYLeche();
        addIceCubes();
    }

    public void makeCoffeeWithMilkOfTheWeather() {
        makeCoffeeWithMilk();
        addIceCubes();
    }
}
