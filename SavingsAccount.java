package com.basic;

public class SavingsAccount{
	static double annualInterestRate;
	double savingsBalance,interest;
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance=savingsBalance;
		
	}
	
public void calculateMonthlyInterest() {
	interest=( savingsBalance*annualInterestRate/100.0)/12;
	savingsBalance+=interest;
	System.out.println(savingsBalance);
}
public static void modifyInterestRate (int newValue) {
	annualInterestRate=newValue;
}
public static void main(String[] args) {
	SavingsAccount saver1=new SavingsAccount(2000.00);
	SavingsAccount saver2=new SavingsAccount(3000.00);
	 SavingsAccount.modifyInterestRate(4);
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	 SavingsAccount.modifyInterestRate(5);
	 saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
}
}