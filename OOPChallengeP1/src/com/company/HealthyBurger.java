package com.company;

import java.util.ArrayList;

public class HealthyBurger extends BaseBurger {

    public HealthyBurger(String meat, double basePrice) {
        super("Healthy Burger", "Rye Bread", meat, basePrice);
        setMaxItems(6);
    }

}
