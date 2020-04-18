package dev.twobeardednomads;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Enter a valid choice from 0 - 6");
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress:");
        System.out.println("\t 0 - Print choice options.");
        System.out.println("\t 1 - Print current list of items.");
        System.out.println("\t 2 - Add item to the list.");
        System.out.println("\t 3 - Modify an existing item.");
        System.out.println("\t 4 - Remove an item from the list.");
        System.out.println("\t 5 - Search for an item.");
        System.out.println("\t 6 - Quit.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item: ");
        String item = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(item, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in the grocery list.");
        } else {
            System.out.println(searchItem + " was not found.");
        }
    }

    public static void processArrayList() {
        // Examples of copying ArrayLists

        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] stringArray = new String[groceryList.getGroceryList().size()];
        stringArray = groceryList.getGroceryList().toArray(stringArray);
    }
}
