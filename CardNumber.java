/*
CardNumber.java
@author JFS
01-04-2022
*/

import javax.swing.JOptionPane;
public class CardNumber{
	public static void main(String args[]){
		String cardNum, hiddenNum;

		StringBuffer sBuffer = new StringBuffer();

		cardNum = JOptionPane.showInputDialog(null, "Enter your card number");

		int len = cardNum.length();
		for(int i = 0; i <= len - 4; i ++ ){
			sBuffer.append("*");
		}
		for(int i = len - 4; i < len; i++){
			sBuffer.append(cardNum.charAt(i));

		}
		hiddenNum = sBuffer.toString();
		JOptionPane.showMessageDialog(null, hiddenNum);

	}

}