/*
CardGameApp.java
@author JFS
27-04-22
*/
import javax.swing.JOptionPane;
public class CardGameApp{
	public static void main(String args[]){
		//variables
		int sum, points;
		int gameCards[] = new int[4];
		int numTurns;

		//objects
		CardGame myCardGame;
		myCardGame = new CardGame();

		//
		numTurns = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many games you wnat to play 3, 5 or 10"));

		for(int i = 0; i < numTurns; i++){
			//generate the game cards
			myCardGame.genCards();
			//call the calcPoints method
			myCardGame.calPoints();
			//display cards to the usre
			gameCards = myCardGame.getCards();
			for(int j = 0; j < gameCards.length; j++){
				JOptionPane.showMessageDialog(null, gameCards[j]);
			}
			JOptionPane.showMessageDialog(null, "Points; " + myCardGame.getPoints());
		}

	}
}

		/*
		int input;
		int total = 0;

		input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many games you wnat to play 3, 5 or 10"));

		if(input == 3 || input == 5 || input == 10){
			for(int i = 0; i < input; i++){
				int c1 = 1 + (int)(Math.random() * 14);
				int c2 = 1 + (int)(Math.random() * 14);
				int c3 = 1 + (int)(Math.random() * 14);
				int c4 = 1 + (int)(Math.random() * 14);

				int sum = c1 + c2 + c3 + c4;

				JOptionPane.showInputDialog(null, "Reminder 11 = Jack, 12 = Queen and 13 = King");
				JOptionPane.showInputDialog(null, "card 1 = " + c1 + ", card 2 = " + c2 + ", card 3 = " + c3 + ", card 4 = " + c4);

				if((c1 == c2) && (c2 == c3) && (c3 == c4)){
					sum =+ 30;
				}
				if(sum < 10){
					sum =+ 50;
				}

				JOptionPane.showInputDialog(null, "total score = " + sum);
				total = total + sum;
			}
			JOptionPane.showInputDialog(null, "You total score is " + total);

		}else{
			JOptionPane.showInputDialog(null, "not a valid number of turns please try again");
		}
		*/