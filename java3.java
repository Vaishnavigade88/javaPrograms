/*Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest rate for
all account holders. Each object of the class contains a private instance variable savingsBalance
indicating the amount the saver currently has ondeposit. Provide method calculateMonthlyInterest to
calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12
this interest should be added to savingsBalance. Provide a static method modifyInterestRate that
sets the annualInterestRate to a new value.*/

import java.util.*;
public class SavingsAccount {
    // Static variable to store the annual interest rate for all account holders
    private static double annualInterestRate;
    // Instance variable to store the savings balance of each account holder
    private double savingsBalance;

    // Constructor to initialize the savings balance
    public SavingsAccount(double initialBalance) {
        this.savingsBalance = initialBalance;
    }

    // Method to calculate monthly interest and update the savings balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
