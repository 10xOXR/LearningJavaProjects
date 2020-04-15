package dev.twobeardednomads;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 10;
	    int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray[1] = 1;
        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change anotherIntArray = " + Arrays.toString(anotherIntArray));

        modifyArray(myIntArray);
        System.out.println("After modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After modify anotherIntArray = " + Arrays.toString(anotherIntArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
    }
}
