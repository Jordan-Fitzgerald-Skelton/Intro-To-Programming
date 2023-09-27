/*
jOptionPane_Example.java
@author JFS
04/02.2022
*/

import javax.swing.JOptionPane;

public class JOptionPane_Example {
    public static void main(String[] args) {

		String myName;
		int myAge;

		//input
		myName = JOptionPane.showInputDialog(null, "Enter your name");

		myAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age "));

		//output
		JOptionPane.showMessageDialog(null, "Hello " + myName + " you are " + myAge);
	}
}