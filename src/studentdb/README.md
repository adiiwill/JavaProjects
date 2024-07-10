# Student Database Application

## Project Overview

This Java application simulates a student database management system for an educational institution. It demonstrates object-oriented programming principles, user input handling, and basic data management in Java.

## Features

- Enroll new students
- Generate unique student IDs
- Manage course enrollment for each student
- Handle tuition payments
- Display student information

## Project Structure

- `StudentDB.java`: Main application class
- `Student.java`: Class representing a student with all associated properties and methods

## How It Works

1. The application prompts the user to specify the number of students to enroll.
2. For each student, it collects:
   - First name
   - Last name
   - Year level (Freshman, Sophomore, Junior, Senior)
3. The system generates a unique student ID for each student.
4. Students can enroll in multiple courses, with each course adding to their tuition balance.
5. Students can make tuition payments.
6. The application displays comprehensive information for all enrolled students.

## Setup and Running

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Compile all Java files in the `studentdb` package.
3. Run the `StudentDB` class.

```bash
javac studentdb/*.java
java studentdb.StudentDB
```

## Class Descriptions

### Student
- Manages all student-related operations
- Properties include firstName, lastName, gradeYear, studentID, courses, and tuitionBalance
- Methods for enrolling in courses, viewing balance, paying tuition, and displaying student information

### StudentDB
- Contains the `main` method
- Handles the overall flow of the application, including student creation and data display

## Usage Example

The application will guide you through the process of adding students, enrolling them in courses, and making tuition payments. Here's a sample interaction:

```
Enter number of new students to enroll: 2
Enter student first name: John
Enter student last name: Doe
1 - Freshmen
2 - Sophomore
3 - Junior
4 - Senior
Enter student class level: 1
John Doe | 11001
Enter course to enroll (Q to quit): 
Math 101
Enter course to enroll (Q to quit): 
English 101
Enter course to enroll (Q to quit): 
Q
Your balance is: $1200
Enter your payment: $600
Thank you for your payment of $600
Your balance is: $600
...
```

## Configuration

- The cost per course is set to $600 by default. This can be modified in the `Student` class.
- The starting student ID is set to 1000 and increments for each new student.