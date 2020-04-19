package dev.twobeardednomads;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName, ArrayList<Customer> customers) {
        this.branchName = branchName;
        this.customers = customers;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(Customer newCustomer) {
        if (findCustomer(newCustomer.getCustName()) >= 0) {
            return false;
        }
        customers.add(newCustomer);
        return true;
    }

    public boolean addTransaction(Customer existingCustomer, double transaction) {
        if (findCustomer(existingCustomer) < 0) {
            return false;
        }
        return existingCustomer.addTransaction(transaction);
    }

    public Customer queryCustomer(String name) {
        int position = findCustomer(name);
        if(position >=0) {
            return this.customers.get(position);
        }

        return null;
    }

    private int findCustomer(Customer searchCustomer) {
        return this.customers.indexOf(searchCustomer);
    }

    private int findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer tempCustomer =this.customers.get(i);
            if (tempCustomer.getCustName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }
}
