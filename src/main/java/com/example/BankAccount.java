package com.example;

public class BankAccount {
    int balance;
    int accountNumber;
    public BankAccount(int balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void deposit(int amount) {
        System.out.println(accountNumber);
    }



    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }

    public void withdraw(int amount){
        System.out.println(balance <= balance);
    //не должно позволяться снимать больше, чем есть

    }








}
