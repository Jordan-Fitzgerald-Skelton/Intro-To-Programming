/* Circle2.java
   @author JFS
   04/02/2022
*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Circle2 {
    public static void main(String[] args) {
		// Declare variables
        int diameter;
        double radius;
        double area, circumference;
        final double PI = 3.14159;

		// Declare and create object
        Scanner sc = new Scanner(System.in);

		// input
        System.out.println("Please enter the diameter of the circle");
        diameter = sc.nextInt();

		// process
		//radius = diameter / 2;

		//Casting
		//implicate casting
		//radius = diameter / 2.0;

		//explicit casting
		radius = (double)diameter / 2;

		//how to type radius ^ 2
		//area = PI * Math.pow(radius, 2);

        area = PI * (radius * radius);
        circumference = 2 * PI * radius;

		// output
        System.out.println("The circle with radius: " + radius +
                ", has area: " + area + " and circumference: " + circumference);

    }

}