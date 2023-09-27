/*
CinemaApp.java
@author JFS
25-02-22
*/

import java.util.Scanner;
public class CinemaApp{
	//main method
	public static void main(String args[]){
		//declare variables
		int myAge;
		//declare
		Scanner in;
		//create
		in = new Scanner(System.in);

		//input
		System.out.println("Enter your age");
		myAge=in.nextInt(); //takes in data

		//if statement
		if(myAge == 100){
			//if true then execute this code
			System.out.println("You get in for free");
		}else{
			System.out.println("you have to pay");
		}

		//outside the if statment
		System.out.println("Outside if statment");

		}
}