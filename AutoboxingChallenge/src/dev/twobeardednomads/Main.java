package dev.twobeardednomads;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank permanentTSB = new Bank(new ArrayList<>());

    public static void main(String[] args) {

        boolean quit = false;
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (7 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nQuitting...");
                    quit = true;
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    listBranches();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    addTransaction();
                    break;
                case 5:
                    listBranchCustomers();
                    break;
                case 6:
                    listCustomerTransactions();
                    break;
                case 7:
                    printActions();
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        }

    }

    private static void printActions() {
        System.out.println("\nAvailable actions:");
        System.out.println("0  - to quit\n" +
                "1  - Add new Branch.\n" +
                "2  - List all branches.\n" +
                "3  - Add new customer to existing branch.\n" +
                "4  - Add transaction to existing branch customer\n" +
                "5  - Print list of branch customers\n" +
                "6  - Print branch customer transactions\n" +
                "7  - Print a list of available actions.");
        System.out.println("Choose your action: ");
    }

    private static void addBranch() {
        System.out.println("Enter new branch name: ");
        String branchName = scanner.nextLine();
        Branch newBranch = new Branch(branchName, new ArrayList<>());
        if (permanentTSB.addBranch(newBranch)) {
            System.out.println("New Branch has been added.");
        } else {
            System.out.println("Operation failed - Branch already exists.");
        }
    }

    private static void listBranches() {
        permanentTSB.listBranches();
    }

    private static void addCustomer() {
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        Branch branch = permanentTSB.queryBranch(branchName);
        if (branch != null) {
            System.out.println("Enter new customer name: ");
            String name = scanner.nextLine();
            System.out.println("Enter opening account balance: ");
            double balance = scanner.nextDouble();
            Customer newCustomer = new Customer(name, balance, new ArrayList<>());
            if (permanentTSB.addCustomer(branch, newCustomer)) {
                System.out.println("Customer successfully created.");
            } else {
                System.out.println("Customer already exists in " + branchName + " branch.");
            }
        } else {
            System.out.println("Invalid Branch.");
        }
    }

    private static void addTransaction() {
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        Branch branch = permanentTSB.queryBranch(branchName);
        if (branch != null) {
            System.out.println("Enter customer name: ");
            String name = scanner.nextLine();
            Customer customer = branch.queryCustomer(name);
            if (customer != null) {
                System.out.println("Enter transaction amount: ");
                double amount = scanner.nextDouble();
                if (customer.addTransaction(amount)) {
                    System.out.println("Transaction recorded.");
                } else {
                    System.out.println("Operation failed - Insufficient balance.");
                }
            } else {
                System.out.println("Customer was not found");
            }
        } else {
            System.out.println("Branch was not found.");
        }
    }

    private static void listBranchCustomers() {
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        Branch branch = permanentTSB.queryBranch(branchName);
        if (branch != null) {
            permanentTSB.listBranchCustomers(branch);
        } else {
            System.out.println("Invalid Branch.");
        }
    }

    private static void listCustomerTransactions() {
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        Branch branch = permanentTSB.queryBranch(branchName);
        if (branch != null) {
            permanentTSB.listBranchCustomerTransactions(branch);
        } else {
            System.out.println("Invalid Branch.");
        }
    }
}
