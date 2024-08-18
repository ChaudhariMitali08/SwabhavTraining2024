package com.techlabs.Model;

public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(int accno, String name, double balance) {
        super(accno, name, balance);
    }

    public void debit(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Amount debited: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Cannot debit. Minimum balance should be maintained.");
        }
    }

    public void display() {
        super.display();
        System.out.println("Account Type: Savings");
        System.out.println("Minimum Balance: " + MIN_BALANCE);
    }

    public double getBalance() {
        return balance;
    }
}










//public class SavingsAccount extends Account {
//    private int minBalance;
//
//    public SavingsAccount(int accountNo, String name, int balance, int minBalance) {
//        super(accountNo, name, balance);
//        this.minBalance = minBalance;
//    }
//
//    public int getMinBalance() {
//        return minBalance;
//    }
//
//    public void setMinBalance(int minBalance) {
//        this.minBalance = minBalance;
//    }
//
//    @Override
//    public String toString() {
//        return "SavingsAccount [accountNo=" + getAccountNo() + ", name=" + getName() + ", balance=" + getBalance() +
//                ", minBalance=" + minBalance + "]";
//    }
//}
