package dev.twobeardednomads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void startPhone() {
        boolean quit = false;
        int choice;
        menuItems();
        while (!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    menuItems();
                    break;
                case 1:
                    showContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Enter a valid choice from 0 - 5");
            }
        }
    }

    public void menuItems() {
        System.out.println("Please select from the following: ");
        System.out.println("\t 0 - Show this menu.");
        System.out.println("\t 1 - Show all contacts.");
        System.out.println("\t 2 - Add a contact.");
        System.out.println("\t 3 - Modify existing contact.");
        System.out.println("\t 4 - Delete a contact.");
        System.out.println("\t 5 - Quit.");
    }

    public void showContacts() {
        int contact = 1;
        if (contacts.size() == 0) {
            System.out.println("You have no contacts in your list.");
        } else {
            for (Contact i : contacts) {
                System.out.println("Contact " + contact + ":");
                i.showContact(i);
                contact++;
            }
        }
    }

    public void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone number: ");
        String number = scanner.nextLine();
        Contact newContact = new Contact(name, number);
        if (!newContact.onFile(contacts, name)) {
            contacts.add(newContact);
        } else {
            System.out.println("Contact with same name already exists.");
        }
    }

    public void modifyContact() {
        System.out.print("Enter contact name to modify: ");
        String item = scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact.onFile(contacts, item)) {
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new phone number: ");
                String number = scanner.nextLine();
                contact.modifyContact(name, number);
                System.out.println("Contact updated.");
            }
        }
    }

    public void removeContact() {
        System.out.print("Enter contact name to remove: ");
        String item = scanner.nextLine();
        for (Iterator<Contact> itr = contacts.iterator(); itr.hasNext();) {
            Contact contact = itr.next();
            if (contact.onFile(contacts, item)) {
                itr.remove();
                System.out.println(item + " was removed from your contacts");
            }
        }
    }

}