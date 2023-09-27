/*
 *CinemaApp1.java
 *@author F.Sheridan
 *15th Oct 2013
 */
 import javax.swing.JOptionPane;
 public class CinemaApp1{
	 public static void main(String args[]){
		 //declare variables
		 int age;

		 //input
		 age = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age"));

		 //process & output
		 if(age == 100){
			 JOptionPane.showMessageDialog(null,"Congratulations, you get free admission!");
		 }


	 }
 }