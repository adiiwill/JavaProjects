package bankaccountapp;

import java.lang.module.FindException;

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    private String name;
    private String sSN;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    // Constructor to set base properties and init the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();

        // Setting the rate
        setRate();
    }

    public abstract void setRate();

    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance += accruedInterest;
        System.out.println("Accrued interest: $" + accruedInterest);
        printBalance();
    }

    private String setAccountNumber() {
        int uniqueID = index;
        return sSN.substring(sSN.length() - 2) + uniqueID + (int)(Math.random() * Math.pow(10, 3));
    }

    // List common methods - transactions
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String destination, double amount) {
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + destination);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now $" + balance);
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + name
                + "\nACCOUNT NUMBER: " + accountNumber
                + "\nBALANCE: " + balance
                + "\nRATE: " + rate + "%"
        );
    }

}
