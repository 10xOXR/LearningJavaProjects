package dev.twobeardednomads;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public boolean addBranch(Branch newBranch) {
        if (findBranch(newBranch.getBranchName()) >= 0) {
            return false;
        }
        branches.add(newBranch);
        return true;
    }

    public boolean addCustomer(Branch branch, Customer customer) {
        if (findBranch(branch) >= 0 && branch.queryCustomer(customer.getCustName()) == null) {
            return branch.addCustomer(customer);
        }
        return false;
    }

    public boolean addTransaction(Branch branch, Customer customer, double transaction) {
        if (findBranch(branch) >= 0 && branch.queryCustomer(customer.getCustName()) != null) {
            return branch.addTransaction(customer, transaction);
        }
        return false;
    }

    public void listBranches() {
        for (int i = 0; i < branches.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + branches.get(i).getBranchName());
        }
    }

    public void listBranchCustomers(Branch branch) {
        if (findBranch(branch) >= 0) {
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            int count = 1;
            if (branchCustomers.size() == 0) {
                System.out.println("No customers are recorded at this branch.");
            } else {
                for (Customer branchCustomer : branchCustomers) {
                    System.out.println("\t" + count + ". " + branchCustomer.getCustName());
                }
            }
        }
    }

    public void listBranchCustomerTransactions(Branch branch) {
        if (findBranch(branch) >= 0) {
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            if (branchCustomers.size() == 0) {
                System.out.println("No customers are recorded at this branch.");
            } else {
                for (Customer customer : branchCustomers) {
                    System.out.println("Transactions for " + customer.getCustName() + ":");
                    int count = 1;
                    if (customer.getTransactions().size() == 0) {
                        System.out.println("\tNo transactions recorded.");
                        System.out.println("Current Balance: €" + customer.getBalance());
                        System.out.println();
                    } else {
                        for (Double transaction: customer.getTransactions()) {
                            System.out.println("\t" + count + ". " + transaction);
                            count++;
                        }
                        System.out.println("Current Balance: €" + customer.getBalance());
                        System.out.println();
                    }
                }
            }
        }
    }

    public Branch queryBranch(String name) {
        int position = findBranch(name);
        if(position >=0) {
            return this.branches.get(position);
        }

        return null;
    }

    private int findBranch(Branch searchBranch) {
        return this.branches.indexOf(searchBranch);
    }

    private int findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch tempCustomer =this.branches.get(i);
            if (tempCustomer.getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }
}
