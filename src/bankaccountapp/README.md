# Bank Account Application

## Project Overview

This Java application simulates a basic banking system, allowing for the creation and management of checking and savings accounts. It demonstrates object-oriented programming principles such as inheritance, abstraction, and interfaces.

## Features

- Create checking and savings accounts
- Perform basic banking operations (deposit, withdraw, transfer)
- Calculate and apply interest rates
- Generate unique account numbers, debit card numbers, and safety deposit box details
- Read account information from a CSV file

## Project Structure

- `BankAccountApp.java`: Main application class
- `Account.java`: Abstract base class for all account types
- `Checking.java`: Represents a checking account
- `Savings.java`: Represents a savings account
- `IBaseRate.java`: Interface for setting base interest rates
- `CSV.java`: Utility class for reading CSV files (not provided in the current set of files)

## How It Works

1. The application reads account information from a CSV file (`NewBankAccounts.csv`).
2. Based on the account type specified in the CSV, it creates either a checking or savings account.
3. Each account is initialized with a unique account number, and type-specific features (e.g., debit card for checking, safety deposit box for savings).
4. The application demonstrates various banking operations and displays account information.

## Setup and Running

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Compile all Java files in the `bankaccountapp` package.
3. Run the `BankAccountApp` class.

```bash
javac bankaccountapp/*.java
java bankaccountapp.BankAccountApp
```

## Class Descriptions

### Account (Abstract Class)
- Base class for all account types
- Handles common properties like name, SSN, balance
- Implements basic banking operations (deposit, withdraw, transfer)

### Checking
- Extends Account
- Includes debit card functionality

### Savings
- Extends Account
- Includes safety deposit box functionality

### IBaseRate (Interface)
- Provides a method to get the base interest rate

## CSV File Format

The `NewBankAccounts.csv` file should be formatted as follows:
```
Name,SSN,AccountType,InitialDeposit
```

Example:
```
John Doe,123456789,Checking,1000
```