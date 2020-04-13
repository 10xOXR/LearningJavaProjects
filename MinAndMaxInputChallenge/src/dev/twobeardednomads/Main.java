package dev.twobeardednomads;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                if (min == 0 && max == 0) {
                    min = number;
                    max = number;
                }
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
                System.out.println("Current Min = " + min + " and current Max = " + max);
            } else {
                System.out.println("Invalid number. Final Min = " + min + " and final Max = " + max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
