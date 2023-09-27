/*
Array2D.java
@author JFS
08-04-2022
*/

import javax.swing.JOptionPane;
public class Array2D{
	public static void main(String args[]){


		String rainfall[][] = new String[4][7];

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 7; j++){
				//take data into the array
				rainfall[i][j] = JOptionPane.showInputDialog(null, "Enter data");
			}
		}

		for(int row = 0; row < 4; row++){
			for(int col = 0; col < 7; col++){
				JOptionPane.showInputDialog(null, "row " + row + " column " + col + "; " + rainfall[row][col] );
			}

		}
	}
}