/*
InterestApp.java
@author JFS
31-03-2022
*/

import javax.swing.JOptionPane;

public class InterestApp{
	public static void main(String[] args){
		int months, moneyBorrowed;
		double totalToPay;
		double interestRate = 0.05;
		double interest;


		   months = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of months"));
		   moneyBorrowed = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount of money you borrowed"));

		   interest = moneyBorrowed * interestRate * months;
		   totalToPay = moneyBorrowed + interest;

		   JOptionPane.showMessageDialog(null, "Total interest to pay = " + interest + " euro");
		   JOptionPane.showMessageDialog(null, "Total amount to be paid = " + totalToPay + " euro");

	}
}