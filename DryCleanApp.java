/*
DryCleanApp.java
@Author JFS
10-03-22
*/

import javax.swing.JOptionPane;

public class DryCleanApp{
	public static void main(String args[]){

		boolean repeat = true;
		String runagain = "";
		int A;
		int D;
		int S;

		while(repeat){

			A = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1 if you want a dress cleaned or 2 if you want a shirt cleaned"));
			if(A == 1){

				Dress myDress;
				myDress = new Dress();

				D = Integer.parseInt(JOptionPane.showInputDialog(null,"How many dresses would you like to be cleaned"));

				myDress.setD(D);
				myDress.compute();

				JOptionPane.showMessageDialog(null, "The total cost is " + myDress.getCost());

			}else if(A == 2){

				Shirts myShirts;
				myShirts = new Shirts();

				S = Integer.parseInt(JOptionPane.showInputDialog(null,"How many shirst would you like to be cleaned"));

				myShirts.setS(S);
				myShirts.compute();

				JOptionPane.showMessageDialog(null, "The total cost is " + myShirts.getCost());
			}else{
				JOptionPane.showMessageDialog(null,"You did not enter a valid input");
			}

			runagain = JOptionPane.showInputDialog(null,"Do you want to run the program again? Yes or No");
			if (runagain.equalsIgnoreCase("no")) {
				repeat = false;
			}
		}
		//outside

	}


}