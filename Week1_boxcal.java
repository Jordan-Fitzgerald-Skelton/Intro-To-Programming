/*
@author JFS
28/ 01/2022
*/
import java.util.Scanner;

public class Week1_boxcal{
	//main method
	public static void main(String args[]){

		Scanner box;
		box = new Scanner(System.in);

		System.out.print("Enter the width ");
		Double width = box.nextDouble();

		System.out.print("Enter the length");
		Double length = box.nextDouble();

		Double area= width * length;

		System.out.println("Area = " + area);

	}
}
