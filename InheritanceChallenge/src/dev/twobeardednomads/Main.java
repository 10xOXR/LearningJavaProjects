package dev.twobeardednomads;

public class Main {

    public static void main(String[] args) {
	    SprinterVan sprinter = new SprinterVan("513",18, true);
	    sprinter.getGears();
	    sprinter.shiftDownGear(1);
	    sprinter.move(50);
	    sprinter.shiftUpGear(3);
    }
}
