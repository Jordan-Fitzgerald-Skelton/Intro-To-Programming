/*
Sentence.java
@author JFS
30-03-2022
*/
import javax.swing.JOptionPane;
public class SentenceApp{
	public static void main(String args []){
		String sentence;
		int spaces;
		int vowels;
		int consonants;
		String repeat;

		Sentence mySentence = new Sentence();

		do{
			sentence = JOptionPane.showInputDialog(null,"Please enter your sentence");
			mySentence.setSentence(sentence);

			mySentence.compute();


			spaces = mySentence.getSpaces();
			vowels = mySentence.getVowels();
			consonants = mySentence.getConsonants();

			JOptionPane.showMessageDialog(null,"There are "+ spaces +" spaces, " + vowels + " vowels and " + consonants + " consonants in your sentence");

			repeat = JOptionPane.showInputDialog(null, "Would you to try again?Enter yes or no");

		}while(repeat.equalsIgnoreCase("yes"));
	}

}