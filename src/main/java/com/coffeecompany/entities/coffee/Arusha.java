package com.coffeecompany.entities.coffee;

import com.coffeecompany.constants.CoffeeContainers;

@SuppressWarnings("unused")
public class Arusha extends Coffee {

    public Arusha(double price, CoffeeContainers coffeeContainers, int weightCoffee) {
        super(price, "Arusha", coffeeContainers, weightCoffee);
    }
}
