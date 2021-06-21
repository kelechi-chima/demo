package com.demo.misc;

public class Account {
    
    private String accountNumber;
    private double balance;
    
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(final double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "Account{" +
            "accountNumber='" + accountNumber + '\'' +
            ", balance=" + balance +
            '}';
    }
}
