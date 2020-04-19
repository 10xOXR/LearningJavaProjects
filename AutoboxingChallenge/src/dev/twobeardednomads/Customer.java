package dev.twobeardednomads;

import java.util.ArrayList;

public class Customer {

    private String custName;
    private Double balance;
    private ArrayList<Double> transactions;

    public Customer(String custName, Double balance, ArrayList<Double> transactions) {
        this.custName = custName;
        this.balance = balance;
        this.transactions = transactions;
    }

    public String getCustName() {
        return custName;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public boolean addTransaction(Double transaction) {
        if (this.balance + transaction < 0) {
            return false;
        }
        this.transactions.add(transaction);
        this.balance += transaction;
        return true;
    }
}
