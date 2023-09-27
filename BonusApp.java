/*
BonusApp.java
@author JFS
04-03-22
*/
import javax.swing.JOptionPane;

public class BonusApp{
	public static void main(String args[]){
		//declare variables
		int itemsold;
		int totalvalue;


		Bonus myBonus;
		myBonus= new Bonus();

		itemsold = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the ammount of items that you have sold"));
		totalvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the total value"));

		myBonus.setItemsold(itemsold);
		myBonus.setTotalvalue(totalvalue);
		myBonus.compute();

		JOptionPane.showMessageDialog(null, "Your Bonus is " + myBonus.getBonus());



	}

}
