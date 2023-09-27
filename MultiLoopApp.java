/*
enter a number 3 times and if you enter 4 you are done
ask the user if they want to go again.
*/
/*
MultiLoopApp.java
@author JFS
23-03-22
*/

import javax.swing.JOptionPane;

public class MultiLoopApp{
	public static void main(String args[]){
		int guess;
		int index;
		String goAgain;

		do{
			index = 1; //initialisation
			while(index <=3){ //termination
				//action
				guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a guess"));
				//progression
				if(guess == 5){
					index = 4;
					JOptionPane.showMessageDialog(null, "You Guessed It !!!");
				}else{
					index++;
				}



				//progression
			}
			goAgain = JOptionPane.showInputDialog(null, "Enter yes to go again");


		}while(goAgain.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "Enter yes to go again");



	}
}