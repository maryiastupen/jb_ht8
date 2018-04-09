package com.epam.java_basics.ht8.task1;


public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("456465");
        bankAccount.setBalance(560000);
        bankAccount.setAccountType("Cumulative");
        bankAccount.setClientFullName("Derek Rojers");

        System.out.println(bankAccount.toString());
    }
}