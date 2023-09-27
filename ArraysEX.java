/*
ArraysEX.java
@author JFS
13-04-2022
*/
import javax.swing.JOptionPane;
public class ArraysEX{
	public static void main(String args[]){
		String names[][] = new String[2][2];

		for(int row = 0; row < names.length; row++){
			for(int col = 0; col < names[row].length; col++){
				names[row][col] = JOptionPane.showInputDialog(null, "Enter name for the cell["+row+"]["+col+"]");
			}

		}

		for(int row = 0; row < names.length; row++){
			for(int col = 0; col < names[row].length; col++){
				JOptionPane.showInputDialog(null, " Data in cell["+row+"] is " + names[row][col]);

			}

		}

	}//main


}//class
