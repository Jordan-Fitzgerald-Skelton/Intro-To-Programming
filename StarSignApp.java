/*
StarSignApp.java
@author JFS
09-03-22
*/
import javax.swing.JOptionPane;

public class StarSignApp{
	public static void main(String args[]){
		//declare variables
		int date;
		String month;


		StarSign myStarSign;
		myStarSign= new StarSign();

		month = JOptionPane.showInputDialog(null, "Enter the month you were born");
		date = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the day you were born"));

		myStarSign.setMonth(month);
		myStarSign.setDate(date);
		myStarSign.compute();

		JOptionPane.showMessageDialog(null, "Your starsign is " + myStarSign.getStarsign());



	}

}