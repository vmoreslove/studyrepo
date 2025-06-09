package com.example;

public class CryptoWallet implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("крипто оплата " + amount);
    }
}
