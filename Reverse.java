/*
Reverse.java
@author JFS
01-04-2022
*/

import javax.swing.JOptionPane;
public class Reverse{
	public static void main(String args[]){
		String word, reverseWord;

		StringBuffer sb = new StringBuffer();

		word = JOptionPane.showInputDialog(null, "Enter a word");

		int len = word.length();
		for(int i = len -1; i >= 0; i -- ){
			sb.append(word.charAt(i));
		}
		reverseWord = sb.toString();
		JOptionPane.showMessageDialog(null, word + " becomes " + reverseWord);

	}

}