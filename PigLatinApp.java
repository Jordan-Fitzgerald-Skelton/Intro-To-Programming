/*
PigLatinApp.java
@authro JFS
01-04-2022
*/

import javax.swing.JOptionPane;

public class PigLatinApp{
	public static void main(String args[]){
		String word;
		String plword;

		PigLatin myPigLatin = new PigLatin();

		word = JOptionPane.showInputDialog(null, "Enter a word ");
		myPigLatin.setWord(word);

		myPigLatin.compute();
		plword = myPigLatin.getPlword();
	}

}