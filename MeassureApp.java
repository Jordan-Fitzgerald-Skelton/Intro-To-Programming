/*
MeassureApp
@author JFS
*/
import java.util.Scanner;

public class MeassureApp{
	public static void main(String args[]){
		int m, cm;

		//declare objects
		Scanner keyboard;
		Meassure myMeassure;

		//create objects
		keyboard = new Scanner(System.in);
		myMeassure = new Meassure();

		//input
		System.out.println("please enter a numbere fo meters");
		m = keyboard.nextInt();
		myMeassure.setM(m);


		//process
		myMeassure.compute();

		//output
		cm = myMeassure.getCm();
		System.out.println("the total number of cm = " + cm);
	}
}