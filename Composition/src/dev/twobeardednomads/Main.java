package dev.twobeardednomads;

public class Main {

    public static void main(String[] args) {
        Case theCase = new Case("ProFlow", "Antec", "680W", new Dimentions(40, 50, 20));
        Monitor monitor = new Monitor("32-7BV", "LG", 32, new Resolution(1920, 1080));
        Motherboard motherboard = new Motherboard("P8-P67", "Asus", 4, 6, "AMBIOS");

        PC pc = new PC(theCase, monitor, motherboard);
        pc.powerUp();
    }
}
