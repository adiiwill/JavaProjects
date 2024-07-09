package emailapp;

import java.util.Scanner;

public class Email {
    // Private variables
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCap = 500;
    private String alternateEmail;

    // Settings
    private int defaultPasswordLength = 8;
    private String companySuffix = "techcomp.com";

    // Constructor w/ firstName, lastName
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Set the department via the `setDepartment()` method
        this.department = setDepartment();

        // Create the email based on the name and the department
        this.alternateEmail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + companySuffix;

        // Set a randomly generated password
        this.password = randomPassword(defaultPasswordLength);
    }

    // Ask for department
    private String setDepartment() {
        System.out.print("Enter the department:" +
                "\n1 for Sales" +
                "\n2 for Development" +
                "\n3 for Accounting" +
                "\n0 for None" +
                "\n\nEnter department code: ");

        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        return switch (depChoice) {
            case 1 -> "sls";
            case 2 -> "dev";
            case 3 -> "acc";
            default -> "";
        };
    }

    // Generate random password
    private String randomPassword(int len) {
        String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        char[] pass = new char[len];

        for (int i = 0; i < len; i++) {
            pass[i] = passSet.charAt((int)(Math.random() * passSet.length()));
        }

        return new String(pass);
    }

    // Set mailbox capacity
    public void setMailboxCap(int newCap) { mailboxCap = newCap; }

    // Set alternate email
    public void setAlternateEmail(String newEmail) { alternateEmail = newEmail; }

    // Change password
    public void setPassword(String newPass) { password = newPass; }

    // Display information
    public void displayInfo() {
        System.out.println("=====INFO=====");
        System.out.println(firstName + " " + lastName);
        System.out.println("-----------------");
        System.out.println("Email:\t\t" + alternateEmail);
        System.out.println("Department:\t" + (this.department.isEmpty() ? "None" : this.department));
        System.out.println("Password:\t" + password);
        System.out.println("Mail cap:\t" + mailboxCap + " mails");
    }

    public String getAlternateEmail() { return alternateEmail; }
    public int getMailboxCap() { return mailboxCap; }
    public String getPassword() { return password; }
}
