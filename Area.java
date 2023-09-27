/*
Area.java
@author JFS
2-2-2022
*/

import java.util.Scanner;

public class Area{
	//main method
	public static void main(String args[]){
		//declare variables
		double radius, area;
		final double PI = 3.14;

		//declare and create object
		Scanner key;
		key = new Scanner(System.in);


		//process

		System.out.println("Enter the radius ");
		radius = key.nextDouble();

		area = PI * (radius * radius);

		System.out.println("Area = " + area);

	}
}