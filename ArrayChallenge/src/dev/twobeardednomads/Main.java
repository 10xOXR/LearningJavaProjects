package dev.twobeardednomads;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printArray(array);
    }

    public static int[] getIntegers(int number) {
        int[] tempArray = new int[number];
        System.out.println("Enter " + number + " integers:\r");
        for (int i = 0; i < tempArray.length; i++) {
            System.out.println("Enter integer " + (i + 1) + " of " + number + ":\r");
            tempArray[i] = scanner.nextInt();
        }
        return sortIntegers(tempArray);
    }

    public static int[] sortIntegers(int[] array) {
        int[] tempArray = new int[array.length];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[(array.length - 1) - i];
        }
        return tempArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
