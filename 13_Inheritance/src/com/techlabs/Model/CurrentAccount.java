package com.techlabs.Model;

public class CurrentAccount extends Account {
   private static final double OVER_DRAFT_LIMIT = 1000;

   public CurrentAccount(int accno, String name, double balance) {
       super(accno, name, balance);
   }

   public void debit(double amount) {
       if (balance + OVER_DRAFT_LIMIT >= amount) {
           balance -= amount;
           System.out.println("Amount debited: " + amount);
           System.out.println("New balance: " +balance);
       } else {
           System.out.println("Overdraft limit exceeded.");
       }
   }

   public void credit(double amount) {
       if (balance < - OVER_DRAFT_LIMIT) {
           System.out.println("Cannot deposit. Overdraft limit exceeded.");
       } else {
//           super.credit(amount);
       }
   }

   public void display() {
       super.display();
       System.out.println("Account Type: Current");
       System.out.println("Overdraft Limit: " + OVER_DRAFT_LIMIT);
   }
}
















//
//public class CurrentAccount extends Account {
//    private int overDraftLimit;
//
//    public CurrentAccount(int accountNo, String name, int balance, int overDraftLimit) {
//        super(accountNo, name, balance);
//        this.overDraftLimit = overDraftLimit;
//    }
//
//    public int getOverDraftLimit() {
//        return overDraftLimit;
//    }
//
//    public void setOverDraftLimit(int overDraftLimit) {
//        this.overDraftLimit = overDraftLimit;
//    }
//
//    @Override
//    public String toString() {
//        return "CurrentAccount [accountNo=" + getAccountNo() + ", name=" + getName() + ", balance=" + getBalance() +
//                ", overDraftLimit=" + overDraftLimit + "]";
//    }
//}
