package dev.twobeardednomads;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(12345678, 35000.00, "Tim Nelson", "tim@2bn.dev", "086-123-4567");
        System.out.println("Populated default object data.");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds) {
        this.balance += funds;
        System.out.println("€" + funds + " was successfully deposited. New balance is €" + this.balance);
    }

    public void withdrawFunds(double funds) {
        if (this.balance < funds) {
            System.out.println("Unable to withdraw €" + funds + ". Current balance is €" + this.balance);
        } else {
            this.balance -= funds;
            System.out.println("€" + funds + " successfully withdrawn. New balance is €" + this.balance);
        }
    }
}
