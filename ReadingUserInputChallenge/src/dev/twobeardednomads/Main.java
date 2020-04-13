package dev.twobeardednomads;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    int sum = 0;
        Scanner scanner = new Scanner(System.in);

	    while (count <= 10) {
            System.out.println("Enter number #" + count + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid number, please try again.");
            }
            scanner.nextLine();
        }
        System.out.println("Total of all inputs = " + sum);
	    scanner.close();
    }
}
