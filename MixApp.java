/*
MixApp.java
@author JFS
06-04-2022
*/

import javax.swing.JOptionPane;
public class MixApp{
	//psv
	public static void main(String args[]){
		//variables
		String word;
		String newWord;

		Mix myMix = new Mix();

		word = JOptionPane.showInputDialog(null,"Enter your name");

		myMix.setWord(word);

		myMix.compute();

		newWord = myMix.getNewWord();

		JOptionPane.showMessageDialog(null,"Your new word is " +newWord);


	}

}