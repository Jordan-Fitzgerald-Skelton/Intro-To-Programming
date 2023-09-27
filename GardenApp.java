/*
GardenApp.java
@author JFS
18-02-22
*/
import java.util.Scanner;

public class GardenApp{
	public static void main(String args[]){
		int in1, in2, in3, in4;
		double total;
		String name;

		//declare objects
		Scanner keyboard;
		Garden myGarden;

		//create objects
		keyboard = new Scanner(System.in);
		myGarden = new Garden();

		//input
		System.out.println("Hello, who am i speaking with");
		name = keyboard.nextLine();
		System.out.println("Welcome " + name + " get ready to enter how much of each item you want");

		System.out.println("please entern how many shovels you need");
		in1 = keyboard.nextInt();
		myGarden.setIn1(in1);

		System.out.println("please entern how many flowers you need");
		in2 = keyboard.nextInt();
		myGarden.setIn2(in2);

		System.out.println("please enter how many seeds you need");
		in3 = keyboard.nextInt();
		myGarden.setIn3(in3);

		System.out.println("please entern how many bags of compost you need");
		in4 = keyboard.nextInt();
		myGarden.setIn4(in4);


		//process
		myGarden.computeTotal();

		//output
		total = myGarden.getTotal();

		//System.out.println("Welcome" + name + "get ready to enter how much of each item you want");
		System.out.println("Your total is = " + total);
	}
}