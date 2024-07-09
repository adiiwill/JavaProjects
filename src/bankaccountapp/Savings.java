package bankaccountapp;

public class Savings extends Account {
    // List properties specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to init settings for the savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    public void setSafetyDepositBox() {
            safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
            safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to the savings account

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your savings account features:"
                +"\n\tSafety Deposit Box ID: " + safetyDepositBoxID
                +"\n\tSafety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
