/*
TemperatureApp.java
@author JFS
23-02-22
*/
import java.util.Scanner;

public class TemperatureApp{
	public static void main(String args[]){
		double in1, in2, in3, in4, in5, in6, in7;
		double averageC, averageF;

		//declare objects
		Scanner keyboard;
		Temperature myTemperature;

		//create objects
		keyboard = new Scanner(System.in);
		myTemperature = new Temperature();

		//input

		System.out.println("please entern the first temperature ");
		in1 = keyboard.nextDouble();
		myTemperature.setIn1(in1);

		System.out.println("please entern the second temperature ");
		in2 = keyboard.nextDouble();
		myTemperature.setIn2(in2);

		System.out.println("please enter the third temperature");
		in3 = keyboard.nextDouble();
		myTemperature.setIn3(in3);

		System.out.println("please entern the fourth temperature ");
		in4 = keyboard.nextDouble();
		myTemperature.setIn4(in4);

		System.out.println("please entern the fifth temperature ");
		in5 = keyboard.nextDouble();
		myTemperature.setIn5(in5);

		System.out.println("please entern the sixth temperature ");
		in6 = keyboard.nextDouble();
		myTemperature.setIn6(in6);

		System.out.println("please entern the seventh temperature ");
		in7 = keyboard.nextDouble();
		myTemperature.setIn7(in7);

		//process
		myTemperature.computeAverageC();
		myTemperature.computeAverageF();

		//output
		averageC = myTemperature.getAverageC();
		averageF = myTemperature.getAverageF();


		System.out.println("the average temperature of the values you entered (in celsius) is " + averageC);
		System.out.println("the average temperature of the values you entered (in  fahrenheit) is " + averageF);
	}
}