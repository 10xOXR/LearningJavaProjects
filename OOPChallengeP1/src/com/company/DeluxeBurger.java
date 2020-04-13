package com.company;

public class DeluxeBurger extends BaseBurger{
    public DeluxeBurger(String rollType, String meat, double basePrice) {
        super("Deluxe Burger", rollType, meat, basePrice);
        setMaxItems(2);
        setAdditionalItem("Chips");
        setAdditionalItem("Drink");
    }
}
