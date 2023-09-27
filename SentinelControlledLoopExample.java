/*
SentinelControlledLoopExample.java
@author JFS
10/03/22
*/

import javax.swing.JOptionPane;

public class SentinelControlledLoopExample{
	public static void main(String args[]){
		int number;
		int sum = 0;
		number = 1;
		while(number != 0){
			number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number "));
			sum = sum + number;
		}

		JOptionPane.showMessageDialog(null, "The sum = " + sum);



	}


}





