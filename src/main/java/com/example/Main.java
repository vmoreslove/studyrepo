package com.example;

public class Main {
    public static void main(String[] args) {
        CheckoutService cs = new CheckoutService();
        cs.setPaymentMethod(new CreditCard());
        cs.checkout(15);
        cs.setPaymentMethod(new CryptoWallet());
        cs.checkout(15);
    }
}
/*
Описание Создайте интерфейс PaymentMethod с методом pay(double amount).
Создайте реализации: CreditCard, PayPal, CryptoWallet.
Дополнительно: создайте класс CheckoutService, принимающий PaymentMethod.
 */