# Bank Management System

Welcome to the Bank Management System — a small Java console application that simulates basic bank account operations and user interaction.

## 🔍 Project Overview

This project demonstrates a simple bank account management flow, including:

- Secure PIN-based login
- Balance inquiry
- Deposit functionality
- Withdrawal transactions with fund validation
- Account details display

The application is built using plain Java and runs in the terminal.

## 📁 Project Files

- `BankAccount.java`
  - Implements the `BankAccount` class.
  - Holds account data such as account number, holder name, PIN, and balance.
  - Supports methods for login, checking balance, deposit, withdrawal, and displaying account details.

- `BankApp.java`
  - Provides the console-based application entry point.
  - Uses `Scanner` for user input.
  - Demonstrates the system workflow with a sample account and interactive menu.

- `.gitignore`
  - Prevents compiled `*.class` files from being committed to the repository.

## 🚀 Features

- PIN authentication to simulate login security
- Positive amount validation for deposits
- Insufficient funds handling for withdrawals
- Clear console menu with user-driven interaction
- Reusable account business logic separated from app UI

## ▶️ How to Run

1. Open a terminal in the project folder.
2. Compile the Java sources:
   ```sh
   javac BankAccount.java BankApp.java
   ```
3. Run the application:
   ```sh
   java BankApp
   ```
4. Enter the PIN and choose options from the menu.

## ✅ Example Flow

1. Start application
2. Enter PIN
3. Choose `1` to check balance
4. Choose `2` to deposit funds
5. Choose `3` to withdraw funds
6. Choose `4` to view account details
7. Choose `5` to exit

## 💡 Notes

- This is a demo application intended for learning Java and basic object-oriented design.
- You can extend it by adding multiple accounts, file persistence, transaction history, or an improved user interface.

## 📌 Repository

- Branch: `main`
- Remote: `https://github.com/Darshanmane1143/Bank-Management-System.git`
