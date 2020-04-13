package com.company;

public class Main {

    public static void main(String[] args) {
	    BaseBurger burger = new BaseBurger("Hamburger", "Plain", "Beef", 3.5);
	    burger.setAdditionalItem("Lettuce");
	    burger.setAdditionalItem("Cheese");
	    burger.setAdditionalItem("Mayo");
		burger.setAdditionalItem("Ketchup");
		burger.setAdditionalItem("Onions");
		burger.getBurgerDetails();

		System.out.println();

		HealthyBurger healthy = new HealthyBurger("Chicken", 4.5);
		healthy.setAdditionalItem("Lettuce");
		healthy.setAdditionalItem("Cheese");
		healthy.setAdditionalItem("Mayo");
		healthy.setAdditionalItem("Ketchup");
		healthy.setAdditionalItem("Onions");
		healthy.getBurgerDetails();

		System.out.println();

		DeluxeBurger deluxe = new DeluxeBurger("Brioche", "Angus Beef", 5.0);
		deluxe.setAdditionalItem("Cheese");
		deluxe.getBurgerDetails();
	}
}
