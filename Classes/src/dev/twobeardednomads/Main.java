package dev.twobeardednomads;

public class Main {

    public static void main(String[] args) {
        Car mercedesTruck = new Car();
        Car mercedesVan = new Car();
        mercedesVan.setModel("Sprinter");
        mercedesTruck.setModel("Atego");
        System.out.println("Model is " + mercedesVan.getModel());
        System.out.println("Model is " + mercedesTruck.getModel());

    }
}
