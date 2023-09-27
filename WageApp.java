/*
WageApp.java
@author JFS
17-02-22
*/
//does not work
import java.util.Scanner;

public class WageApp{
	public static void main(String args[]){
		double hours, rate, wage;

		//declare objects
		Scanner keyboard;
		Wage myWage;

		//create objects
		keyboard = new Scanner(System.in);
		myWage = new Wage();

		//input
		System.out.println("please enter how many hours you worked");

		hours = keyboard.nextDouble();

		myWage.setHours(hours);

		System.out.println("please enter you rate of pay per hour");

		rate = keyboard.nextDouble();

		myWage.setRate(rate);


		myWage.computeWage();


		//wage = myWage.getWage();

		System.out.println("Your total pay is " + myWage.getWage());
	}
}