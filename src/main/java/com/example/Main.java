package com.example;

public class Main {
    public static void main(String[] args) {
        BankAccount bAccount = new BankAccount(10,15);
        bAccount.deposit(5);
        bAccount.withdraw(17);
       

        System.out.println(bAccount.getBalance());

    }

}
/*
1. Инкапсуляция: Класс BankAccount
Описание:Создайте класс BankAccount с полями balance, accountNumber. Реализуйте методы:
	•	deposit(double amount)
	•	withdraw(double amount)
	•	getBalance()
Требования:
	•	Все поля должны быть private
	•	Доступ через геттеры/сеттеры
	•	В withdraw не должно позволяться снимать больше, чем есть
 */