/*
 *CinemaApp2.java
 *@author F.Sheridan
 *15th Oct 2013
 */
 import javax.swing.JOptionPane;
 public class CinemaApp2{
	 public static void main(String args[]){
		 //declare variables
		 int age;

		 //input
		 age = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age"));

		 //process & output
		 if(age < 15){
			 JOptionPane.showMessageDialog(null, "Your ticket will cost 5 euro");
		 }
		 else{
			 JOptionPane.showMessageDialog(null,"Your ticket will cost 10 euro");
		 }

	 }
 }