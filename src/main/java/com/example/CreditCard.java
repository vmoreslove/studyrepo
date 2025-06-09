package com.example;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("оплата кк " + amount);
    }
}
