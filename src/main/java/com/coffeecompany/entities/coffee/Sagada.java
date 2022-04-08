package com.coffeecompany.entities.coffee;

import com.coffeecompany.constants.CoffeeContainers;

@SuppressWarnings("unused")
public class Sagada extends Coffee{

    public Sagada(double price, CoffeeContainers coffeeContainers, int weightCoffee) {
        super(price, "Sagada", coffeeContainers, weightCoffee);
    }

}
