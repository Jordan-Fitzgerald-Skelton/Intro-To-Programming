/*
SwapApp.java
@author JFS
06-04-2022
*/

import javax.swing.JOptionPane;
public class SwapApp{
	//psv
	public static void main(String args[]){
		//variables
		String word;
		String newWord;

		Swap mySwap = new Swap();

		word = JOptionPane.showInputDialog(null,"Enter your name");

		mySwap.setWord(word);

		mySwap.swapLetters();

		newWord = mySwap.getNewWord();

		JOptionPane.showMessageDialog(null,"Your new word is " +newWord);


	}

}