/*
BoxApp
@author JFS
18-02-22
*/
import java.util.Scanner;

public class BoxApp{
	public static void main(String args[]){
		double width, height, length, area, volume;

		//declare objects
		Scanner keyboard;
		Box myBox;

		//create objects
		keyboard = new Scanner(System.in);
		myBox = new Box();

		//input
		System.out.println("please entern the width");
		width = keyboard.nextDouble();
		myBox.setWidth(width);

		System.out.println("please entern the length");
		length = keyboard.nextDouble();
		myBox.setLength(length);

		System.out.println("please entern the height");
		height = keyboard.nextDouble();
		myBox.setHeight(height);


		//process
		myBox.computeArea();
		myBox.computeVolume();

		//output
		area = myBox.getArea();
		volume = myBox.getVolume();

		System.out.println("the area = " + area);
		System.out.println("the volume = " + volume);
	}
}