/*
CoinTossApp.java
@author JFS
06-05-22
*/
// used to imprt JOptionPane so that we can use it to get inputs and display messages
import javax.swing.JOptionPane;

public class CoinTossApp{
	public static void main(String args[]){
		//variables
		int Tscore = 0;

		//declares and assigns objects
		CoinToss myCoinToss;
		myCoinToss = new CoinToss();

		//greets the user
		JOptionPane.showInputDialog(null, "Welcome to the coin toss game, press enter to begin");

		//do while loop is used to loop the game until the total scorew (Tscore) = 100
		do{
			//call the assign method
			myCoinToss.assign();
			//prints out and calls Toss 1, 2 and 3
			JOptionPane.showMessageDialog(null, "Toss1 =" + myCoinToss.getToss1());
			JOptionPane.showMessageDialog(null, "Toss2 =" + myCoinToss.getToss2());
			JOptionPane.showMessageDialog(null, "Toss3 =" + myCoinToss.getToss3());

			//calls the poits method;
			myCoinToss.points();
			//returns the total score after each
			JOptionPane.showMessageDialog(null, myCoinToss.getTscore());



		}while (Tscore < 100);
	}
}