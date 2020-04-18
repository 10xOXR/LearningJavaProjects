package dev.twobeardednomads;

import java.util.ArrayList;

public class Contact {

    private String contactName;
    private String contactNumber;

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    private String getContactName() {
        return contactName;
    }

    private String contactDetails() {
        return ("Name: " + contactName + "\n\tPhone: " + contactNumber);
    }

    private int findItem(ArrayList<Contact> contacts, String searchText) {
        for (Contact i : contacts) {
            if(i.getContactName() != null && i.getContactName().contains(searchText)) {
                return contacts.indexOf(i);
            }
        }
        return -1;
    }

    public void showContact(Contact contact) {
        System.out.println("\t" + contact.contactDetails());
        System.out.println();
    }

    public boolean onFile(ArrayList<Contact> contacts, String searchItem) {
        int position = findItem(contacts, searchItem);
        return position >= 0;
    }

    public void modifyContact(String name, String number) {
        contactName = name;
        contactNumber = number;
    }
}
