package com.example;

public class BankAccount {
    private double balance;
    private int accountNumber;
    public BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
       balance = balance + amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "balance=" + balance + ", accountNumber=" + accountNumber + '}';
    }

    public void withdraw(int amount){
        balance = balance - amount;
        if(balance < 0){
            balance = 0;
        }
    //не должно позволяться снимать больше, чем есть
    }

}
