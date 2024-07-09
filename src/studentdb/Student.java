package studentdb;

import java.util.Scanner;

public class Student {
    // Private variables
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;

    private static int courseCost = 600;
    private static int id = 1000;

    // Constructor: get the first and last name wit the grade year
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\n\nEnter student class level: ");
        gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " | " + studentID);
    }

    // Generate student id
    private void setStudentID() {
        // Grade level + ID
        id++;
        studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        Scanner in = new Scanner(System.in);

        // Loop
        while (true) {
            System.out.println("Enter course to enroll (Q to quit): ");
            String course = in.nextLine();

            if (course.equals("Q")) break;

            courses += "\n\t" + course;
            tuitionBalance += courseCost;
        }
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your payment: $");
        int payment = in.nextInt();

        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);

        viewBalance();
    }

    // Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nID: " + studentID +
                "\nGrade level: " + gradeYear +
                "\nCourses enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
