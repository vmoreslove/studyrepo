package com.example;

public class CheckoutService {
    PaymentMethod pm;
    public PaymentMethod getPaymentMethod() {
        return pm;
    }
    public void setPaymentMethod(PaymentMethod pm) {
        this.pm = pm;
    }
    public void checkout(double amount){
        pm.pay(amount);
    }
}
