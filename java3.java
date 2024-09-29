/*Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest rate for
all account holders. Each object of the class contains a private instance variable savingsBalance
indicating the amount the saver currently has ondeposit. Provide method calculateMonthlyInterest to
calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12
this interest should be added to savingsBalance. Provide a static method modifyInterestRate that
sets the annualInterestRate to a new value.*/

import java.util.*;
public class SavingsAccount {
    private static double annualInterestRate;
   
    private double savingsBalance;

   
    public SavingsAccount(double initialBalance) {
        this.savingsBalance = initialBalance;
    }

   
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
       
        SavingsAccount.modifyInterestRate(0.04);  

     
        SavingsAccount account1 = new SavingsAccount(1000.00);
        SavingsAccount account2 = new SavingsAccount(2000.00);

 
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();

 
        System.out.printf("Account 1 Balance: $%.2f%n", account1.getSavingsBalance());
        System.out.printf("Account 2 Balance: $%.2f%n", account2.getSavingsBalance());

     
        SavingsAccount.modifyInterestRate(0.05);  

    
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();

  
        System.out.printf("Account 1 Balance after interest rate change: $%.2f%n", account1.getSavingsBalance());
        System.out.printf("Account 2 Balance after interest rate change: $%.2f%n", account2.getSavingsBalance());
    }
}
