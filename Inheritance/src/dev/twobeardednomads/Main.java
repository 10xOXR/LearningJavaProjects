package dev.twobeardednomads;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);

	    Dog dog = new Dog("Huskie", 20, 40, 2, 4, 1, 40, "Wirey");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
