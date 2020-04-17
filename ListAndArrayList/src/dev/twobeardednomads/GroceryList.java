package dev.twobeardednomads;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(String item, String newItem) {
        int position = findItem(item);
        if (position >= 0) {
            modifyGroceryList(position, newItem);
        } else {
            System.out.println("Item not found.");
        }
    }

    private void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println(" Item " + (position + 1) + " has been replaced");
    }

    public void removeGroceryItem(String removeItem) {
        int position = findItem(removeItem);
        if (position >= 0) {
            removeGroceryItem(position);
        } else {
            System.out.println("Item not found.");
        }
    }

    private void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(item + " has been removed from the list.");
    }

    private int findItem(String searchText) {
        return groceryList.indexOf(searchText);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
