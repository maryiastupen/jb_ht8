package com.epam.java_basics.ht8.task1;

import java.util.Objects;

public class BankAccount {
    private String accountType;
    private int balance;
    private String accountNumber;
    private String clientFullName;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClientFullName() {
        return clientFullName;
    }

    public void setClientFullName(String clientFullName) {
        this.clientFullName = clientFullName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", clientFullName='" + clientFullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount other = (BankAccount) o;
        return balance == other.balance &&
                Objects.equals(accountType, other.accountType) &&
                Objects.equals(accountNumber, other.accountNumber) &&
                Objects.equals(clientFullName, other.clientFullName);
    }

    @Override
    public int hashCode() {
        Object a[] = {balance, accountNumber, accountType, clientFullName};
        if (a == null)
            return 0;

        int result = 1;

        for (Object element : a) {
            result = 31 * result + (element == null ? 0 : element.hashCode());
        }
        return result;
    }
}
