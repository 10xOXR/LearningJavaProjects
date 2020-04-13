package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BaseBurger {

    private String rollType;
    private String meat;
    private double basePrice;
    private String name;
    private ArrayList<String> items = new ArrayList<String>();
    private int maxItems;
    private int additionCount = 0;
    private final double additionsCost = 0.5;

    public BaseBurger(String name, String rollType, String meat, double basePrice) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = basePrice;
        setMaxItems(4);
    }

    public void setMaxItems(int items) {
        this.maxItems = items;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setAdditionalItem(String addition) {
        if (additionCount < maxItems) {
            this.items.add(addition);
            this.additionCount++;
        } else {
            System.out.println("Cannot add " + addition + ". No further additions may be made.");
        }
    }

    public void getBurgerDetails() {
        double burgerTotal = this.basePrice + (this.additionsCost * this.additionCount);
        System.out.println(this.name + " base price: €" + getBasePrice() + "\n" +
                            "Any additional items incur an additional charge of €0.50.");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Additional Item #" + (i + 1) + ": " + items.get(i));
        }
        System.out.println("Total Cost: €" + burgerTotal);
    }
}
