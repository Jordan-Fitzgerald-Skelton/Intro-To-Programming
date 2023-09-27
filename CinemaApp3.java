/*
 *CinemaApp3.java
 *@author F.Sheridan
 *15th Oct 2013
 */
 import javax.swing.JOptionPane;
 public class CinemaApp3{
	 public static void main(String args[]){
		 //declare variables
		 int age;

		 //input
		 age = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter age"));

		 //process & output
		 if((age < 5) || (age>65)){
			 JOptionPane.showMessageDialog(null,"You get free admission");
		 }
		 else if((age >= 5) && (age <=14)){
			 JOptionPane.showMessageDialog(null,"Your admission is 5 euro");
		 }
		 else{
			 JOptionPane.showMessageDialog(null,"Your admission is 10 euro");
		 }

	 }
 }