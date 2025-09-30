package com.intern.bank;

import java.util.ArrayList;
import java.util.Scanner;

// Account class
class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactions;

    // Constructor
    public Account(String accountNumber, String accountHolder, double initialBalance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with balance: " + initialBalance);
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount + " | Balance: " + balance);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: " + amount + " | Balance: " + balance);
            System.out.println("Withdrawal successful!");
        } else {
            System.err.println("Insufficient balance or invalid amount!");
        }
    }

    // Show balance
    public double getBalance() {
        return balance;
    }

    // Show transaction history
    public void printTransactions() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}