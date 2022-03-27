package com.codingiscaring.solid.openClose.exampleOne.problem;

public class Cook {

    void doPizza(String pizza) {
        switch (pizza) {
            case "Margarita":
                System.out.println("Cocinando pizza margarita");
                break;
            case "Carbonara":
                System.out.println("Cocinando pizza margarita");
                break;
            default:
                System.out.println("No conozco esa receta");
        }
    }
}
