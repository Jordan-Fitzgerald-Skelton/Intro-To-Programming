/*
GuessApp.java
@author JFS
16/ 02/2022
*/

import javax.swing.JOptionPane;

public class GuessApp{
	public static void main(String args[]){
		// declare variables
		int guess;
		String message;

        //objects to declare and create
        //declare
        Guess myGuess;
        //create
        myGuess = new Guess();

        int snum = (int)(Math.random() * 10 + 1);
        myGuess.setSnum(snum);



        //input
        guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number from 1 to 10"));


		myGuess.setGuess(guess);

		myGuess.computeMessage();

		message = myGuess.getMessage();




		//output
		JOptionPane.showMessageDialog(null, message);
        }
}