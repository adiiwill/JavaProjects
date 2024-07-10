# Email Application

## Project Overview

This Java application simulates an email account creation system for a company. It demonstrates object-oriented programming principles and basic input/output operations in Java.

## Features

- Create email accounts for new hires
- Generate company email addresses based on the employee's name and department
- Set and manage email passwords
- Set mailbox capacity
- Define alternate email addresses
- Display account information

## Project Structure

- `EmailApp.java`: Main application class
- `Email.java`: Class representing an email account with all its properties and methods

## How It Works

1. The application creates an `Email` object for a new employee.
2. It prompts the user to select the employee's department.
3. Based on the input, it generates a company email address.
4. It creates a random initial password for the account.
5. The application allows setting of mailbox capacity and alternate email address.
6. Finally, it displays all the account information.

## Setup and Running

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Compile all Java files in the `emailapp` package.
3. Run the `EmailApp` class.

```bash
javac emailapp/*.java
java emailapp.EmailApp
```

## Class Descriptions

### Email
- Manages all email account related operations
- Properties include firstName, lastName, password, department, mailbox capacity, and alternate email
- Methods for setting department, generating random password, setting mailbox capacity, setting alternate email, changing password, and displaying information

### EmailApp
- Contains the `main` method
- Demonstrates the usage of the `Email` class

## Usage Example

```java
Email em1 = new Email("John", "Smith");
em1.setMailboxCap(1000);
em1.setPassword("secret123");
em1.displayInfo();
```