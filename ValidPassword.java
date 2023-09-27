/*
ValidPassword.java
@author JFS
25=03=22
check ther anre no spaces
check that it is over 8 characters
check that one special char has been used *!&
*/

import javax.swing.JOptionPane;
public class ValidPassword{
	//psv
	public static void main(String args[]){
		String word = "";
		int len = 0;
		boolean validChar = false;
		boolean validLen = false;
		boolean noSpaces = false;


		while(!validChar || !validLen || !noSpaces){
			//get the password
			word = JOptionPane.showInputDialog(null, "Enter a password that has no spaces, grater that 8 characters and has to contain 1 of the following *!&");


			//checl for length
			len = word.length();
			validLen = true;
			if(len < 8){
				validLen = false;
				JOptionPane.showInputDialog(null, "Password is to short");
			}
			//check for space
			noSpaces = true;
			for(int i = 0; i < len; i++){
				if(word.charAt(i) == ' '){
					noSpaces = false;
					JOptionPane.showInputDialog(null, "Password contains a space");
				}

			}
			//for char
			validChar = false;
			for(int i = 0; i < len; i++){
				if(word.charAt(i) == '*' || word.charAt(i) == '!' || word.charAt(i) == '&'){
					validChar = true;
				}
			}

		}//end of while loop

		JOptionPane.showInputDialog(null, "Great " + word.substring(len - 3, len));
	}
}