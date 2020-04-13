package dev.twobeardednomads;

public class Main {

    public static void main(String[] args) {
	    BankAccount current = new BankAccount();
        System.out.println("Customer name: " + current.getCustomerName());
        System.out.println("Customer email: " + current.getEmail());
        System.out.println("Customer phone: " + current.getPhoneNumber());
        System.out.println("Account No.: " + current.getAccountNumber());
        System.out.println("Balance: €" + current.getBalance());
        current.depositFunds(1500);
        current.withdrawFunds(1348.26);
        System.out.println("Balance: €" + current.getBalance());

        System.out.println();

        VipCustomer hooman = new VipCustomer();
        System.out.println("Customer name: " + hooman.getName());
        System.out.println("Email Address: " + hooman.getEmailAddress());
        System.out.println("Credit Limit: €" + hooman.getCreditLimit());

        System.out.println();

        VipCustomer hooman2 = new VipCustomer("Chris Quinn", "chris@2bn.dev");
        System.out.println("Customer name: " + hooman2.getName());
        System.out.println("Email Address: " + hooman2.getEmailAddress());
        System.out.println("Credit Limit: €" + hooman2.getCreditLimit());

        System.out.println();

        VipCustomer hooman3 = new VipCustomer("Tim Nelson", 250000.00, "tim@2bn.dev");
        System.out.println("Customer name: " + hooman3.getName());
        System.out.println("Email Address: " + hooman3.getEmailAddress());
        System.out.println("Credit Limit: €" + hooman3.getCreditLimit());
    }
}
