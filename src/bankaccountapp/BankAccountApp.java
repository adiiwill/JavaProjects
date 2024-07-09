package bankaccountapp;

import utilities.CSV;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class BankAccountApp {
    public static void main(String[] args) {
        // Creating an array for holding the new accounts
        List<Account> newAccounts = new LinkedList<Account>();

        // Read CSV File and create accounts based on the data

        // Importing data from the CSV file using the CSV reader
        List<String[]> newUsers = CSV.read("./src/bankaccountapp/NewBankAccounts.csv");

        for (String[] usr : newUsers) {
            String name    = usr[0];
            String sSN     = usr[1];
            String type    = usr[2];
            double deposit = Double.parseDouble(usr[3]);

            if (Objects.equals(type, "Savings")) {
                System.out.println("OPENING SAVINGS ACCOUNT");
                newAccounts.add(new Savings(name, sSN, deposit));
            }
            else if (Objects.equals(type, "Checking")) {
                System.out.println("OPENING CHECKING ACCOUNT");
                newAccounts.add(new Checking(name, sSN, deposit));
            }
            else {
                System.out.println("COULD NOT DETERMINE ACCOUNT TYPE");
            }

            for (Account a : newAccounts) {
                System.out.println("\n**************************\n");
                a.showInfo();
            }
        }
    }
}
