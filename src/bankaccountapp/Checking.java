package bankaccountapp;

public class Checking extends Account {
    // List properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPIN;

    // Constructor to init checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    private void setDebitCard() {
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    // List any methods specific to the checking account

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your checking account features:"
                +"\n\tDebit card number: " + debitCardNumber
                +"\n\tDebit card PIN: " + debitCardPIN
        );
    }
}
