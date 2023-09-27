/*
@author JFS
28/ 01/2022
*/
import java.util.Scanner;

public class Week1_lab{
	//main method
	public static void main(String args[]){
		//declare my variables
		int number;
		String word;
		double decnum;

		// declare and create objects
		Scanner keyboard;

		keyboard = new Scanner(System.in);


		//initialise
		number = 2;

		//re-assign
		number = 3;

		word = "Hello";

		decnum = 26.8;

		System.out.println(number); //prints out the value contained in the variable number
		//assign value to word and display
		System.out.println(word);
		//assign value to duoble and display
		System.out.println(decnum);

		final double PI = 3.14;

		//ask a question
		System.out.println("Enter nuber");

		//take in the data
		number = keyboard.nextInt();
		//print
		System.out.println("Your number was " + number);


	}

}