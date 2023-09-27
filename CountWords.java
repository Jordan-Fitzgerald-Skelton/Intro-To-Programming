/*
CountWords.java
@author JFS
30-03-2022
*/
import javax.swing.JOptionPane;
public class CountWords{
	public static void main(String args []){
		String sentence;
		int countword = 1;

		sentence = JOptionPane.showInputDialog(null,"Please enter your sentence");

		for(int i = 0; i < sentence.length(); i++ ){

			if(sentence.charAt(i) == ' '){
				countword ++;

			}
		}

		JOptionPane.showMessageDialog(null,"The number of words in your sentence = " + countword);
	}

}