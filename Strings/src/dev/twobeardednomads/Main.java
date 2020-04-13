package dev.twobeardednomads;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // long
        // int
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to \"" + myString + "\"");
        myString = myString + ", and this is some more.";
        System.out.println("myString is equal to \"" + myString + "\"");
        myString = myString + " \u00A9 2020";
        System.out.println("myString is equal to \"" + myString + "\"");

    }
}
