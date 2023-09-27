/* Circle.java
   @author Enda
   4/2/22
*/
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
		// Declare variables
        int radius;
        double area, circumference;
        final double PI = 3.14159;

		// Declare and create object
        Scanner sc = new Scanner(System.in);

		// input
        System.out.println("Please enter the radius of the circle");
        radius = sc.nextInt();

		// process
        area = PI * (radius * radius);
        circumference = 2 * PI * radius;

		// output
        System.out.println("The circle with radius: " + radius +
                ", has area: " + area + " and circumference: " + circumference);

    }

}