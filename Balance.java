/*
Balance
 @author JFS
 @date:
 */

import java.util.Scanner;
public class Balance{
	public static void main(String args[]){
		double currAcc, savAcc;

		Scanner keyboard = new Scanner (System.in);

		System.out.println("What is your cuurent account balance");
		currAcc = keyboard.nextInt();

		System.out.println("What is your savings account balance");
		savAcc = keyboard.nextInt();

		if (currAcc < 10 && savAcc > 100) {
			System.out.println("CURRENT ACCOUNT LOW!!");
		}else if (currAcc > 10 && savAcc < 100 ){
			System.out.println("SAVINGS ACCOUNT LOW!!");
		}else if (currAcc < 10 && savAcc <100){
			System.out.println("BOTH ACCOUNTS ARE DANGERIOUSLY LOW!!");
		}else{
			System.out.println("Well done dont let you blance get too low");
		}




	}
}
