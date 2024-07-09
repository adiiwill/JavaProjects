package studentdb;

import java.util.Scanner;

public class StudentDB {
    public static void main(String[] args) {
        // Ask how many users we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[in.nextInt()];

        // Create n number of new students
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (Student student : students) {
            System.out.println(student.toString() + "\n");
        }
    }
}
