package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");

        em1.setMailboxCap(1000);
        em1.setPassword("secret123");

        em1.displayInfo();
    }
}