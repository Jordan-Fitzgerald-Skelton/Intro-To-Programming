/*
GuessingGameApp.java
@author JFS
23-03-22
*/


import javax.swing.JOptionPane;

public class GuessingGameApp{
	public static void main(String args[]){
		// declare variables
		int guess;
		int index;
		String message;
		String goAgain;

		do{
			index = 0;
			//declare
			GuessingGame myGuessingGame;
			//create
			myGuessingGame = new GuessingGame();

			int snum = (int)(Math.random() * 10 + 1);
			myGuessingGame.setSnum(snum);

			index = 1; //initialisation
			while(index <=3){ //termination
			//action
				guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number from 1 to 10"));
				myGuessingGame.setGuess(guess);

				//progression
				if(guess == snum){
					index = 4;
					myGuessingGame.computeMessage();
					message = myGuessingGame.getMessage();
					JOptionPane.showMessageDialog(null, message);
				}else{
					index++;
					myGuessingGame.computeMessage();
					message = myGuessingGame.getMessage();
					JOptionPane.showMessageDialog(null, message);
				}

		}
		goAgain = JOptionPane.showInputDialog(null, "Enter yes to go again");

		}while(goAgain.equalsIgnoreCase("yes"));



        }
}