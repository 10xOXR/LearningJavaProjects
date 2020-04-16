package dev.twobeardednomads;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(findMin(readIntegers(5)));
    }

    public static int[] readIntegers(int count) {
        int[] tempArray = new int[count];
        for (int i = 0; i < tempArray.length; i++) {
            System.out.println("Enter Integer " + (i + 1) + " of " + tempArray.length + ":");
            tempArray[i] = scanner.nextInt();
        }
        return tempArray;
    }

    public static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
