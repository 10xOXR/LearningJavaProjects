package dev.twobeardednomads;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Array = " + Arrays.toString(myArray));

        reverse(myArray);
        System.out.println("Reversed array = " + Arrays.toString(myArray));
    }

    private static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[(maxIndex - i)];
            array[maxIndex - i] = temp;
        }
    }
}
