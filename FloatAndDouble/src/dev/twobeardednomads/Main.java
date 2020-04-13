package dev.twobeardednomads;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;
        System.out.println("myIntvalue = " + myIntValue);
        System.out.println("myFloatvalue = " + myFloatValue);
        System.out.println("myDoublevalue = " + myDoubleValue);

        double pounds = 220d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");
    }
}
