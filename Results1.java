/*
Results1.java
@author JFS
08-04-2022
*/


import javax.swing.JOptionPane;
public class Results1{
	public static void main(String args[]){
		double results[] = new double[5];
		String names[] = new String[5];
		int numbers[]; //declare
		numbers = new int[5]; //create

		for(int i = 0; i < results.length; i++){
			double result = Double.parseDouble(JOptionPane.showInputDialog(null, "At the index of " + i + " enter grade"));
			results[i] = result;
		}
		//show the first and last index

		//JOptionPane.showMessageDialog(null,"The first result is "+results[0]);
		//JOptionPane.showMessageDialog(null,"The last results is "+results[results.length - 1 ]);

		for(int i = 0; i < results.length; i++){
			JOptionPane.showMessageDialog(null,"At index of " + i + "; " + results[i]);
		}

	}

}