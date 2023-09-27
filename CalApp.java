/*
CalApp.java
@author JFS
11/02/22
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class CalApp{
	public static void main(String args[]){
		// declare variables
        double num1, num2;
        double sum;
        double difference;
        double mult, div, modulo;
        int input, contype, calc;
        double in1, cel, fah;
        int x, y;



        //objects to declare and create
        //declare
        Cal myCal;
        myCal= new Cal();

        Conver myConver;
        myConver = new Conver();

        tables = new Scanner(System.in);

        input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 for temperature conversion, 2 for calculator and 3 for times tables"));

        if(input == 1){
			contype = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 for celsius to fahrenheit and 2 for fahrenheit to celsius"));
			if(contype == 1){
				in1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number to be converted"));
				myConver.setIn1(in1);
				myConver.computeFah();
				fah = myConver.getFah();
				JOptionPane.showMessageDialog(null, in1 + " in fahrenheit = " + fah );

			}else if(contype == 2){
				in1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number you want to convert"));
				myConver.setIn1(in1);
				myConver.computeCel();
				cel = myConver.getCel();
				JOptionPane.showMessageDialog(null, in1 + " in fahrenheit = " + cel );
			}
		}else if(input == 2){
			calc = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 for addition 2, for subtraction, 3 for multiplication, 4 for division and 5 for moudulos"));
			if(calc ==1){
				//input
				num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number "));
				num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number "));
				//process
				myCal.setNum1(num1);
				myCal.setNum2(num2);

				myCal.computeSum();
				sum = myCal.getSum();

				//output
				JOptionPane.showMessageDialog(null, "The sum = " + sum );

			}else if(calc == 2){
				//input
				num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number "));
				num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number "));
				//process
				myCal.setNum1(num1);
				myCal.setNum2(num2);

				myCal.computeDifference();
				difference = myCal.getDifference();

				//output
				JOptionPane.showMessageDialog(null, "The difference = " + difference );

			}else if(calc == 3){
				//input
				num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number "));
				num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number "));
				//process
				myCal.setNum1(num1);
				myCal.setNum2(num2);

				myCal.computeMult();
				mult = myCal.getMult();

				//output
				JOptionPane.showMessageDialog(null, "The two numbers mutilplied together = " + mult );

			}else if(calc == 4){
				//input
				num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number "));
				num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number "));
				//process
				myCal.setNum1(num1);
				myCal.setNum2(num2);

				myCal.computeDiv();
				div = myCal.getDiv();

				//output
				JOptionPane.showMessageDialog(null, "The two numbers divided together = " + div );
			}else if(calc == 5){
				//input
				num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number "));
				num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number "));
				//process
				myCal.setNum1(num1);
				myCal.setNum2(num2);

				myCal.computeModulo();
				modulo = myCal.getModulo();

				//output
				JOptionPane.showMessageDialog(null, "The modulos of the two numbers = " + modulo );
			}else{
				JOptionPane.showMessageDialog(null, "Not valid please try again");
			}
		}else if( input == 3){
			//
			System.out.print(" Enter a number from 1 - 12: ");
			//assigns the input to x
			x = tables.nextInt();
			//creates a loop
			while(x < 12){
				y = 1;
				while(y <= 12){
					System.out.println(x +"  *  " + y + "  =  " + x * y);
					//adds 1 each time the loop happens
					y++;
				}
			}
		}


