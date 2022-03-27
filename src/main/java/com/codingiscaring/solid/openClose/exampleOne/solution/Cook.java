package com.codingiscaring.solid.openClose.exampleOne.solution;

import java.util.Arrays;
import java.util.List;

public class Cook {
    private final List<String> pizzasInMenu = Arrays.asList("Margarita", "Carbonara");

    void doPizza(String pizza) {
        if (this.pizzasInMenu.contains(pizza)) {
            System.out.println("Oído cocina!");
        } else {
            System.out.println("No conozco esa receta");
        }
    }

    void addNewPizzaToMenu(String pizza) {
        this.pizzasInMenu.add(pizza);
    }
}
