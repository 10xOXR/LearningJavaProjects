package dev.twobeardednomads;

import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//	    int[] myIntArray = new int[25];
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 25;
//        }
//
//        printArray(myIntArray);
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + ": " + array[i]);
//        }
//    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ": Typed value was " + myIntegers[i]);
        }

        System.out.println("Average of array items is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        double arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }

        return (double) arraySum / (double) array.length;
    }
}
