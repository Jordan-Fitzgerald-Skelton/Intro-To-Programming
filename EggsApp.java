/*
EggsApp.java
@author JFS
16/ 02/2022
*/

import javax.swing.JOptionPane;

public class EggsApp{
	public static void main(String args[]){
		// declare variables
		int eggsno;
		int boxes;
		int remainder;

        //objects to declare and create
        //declare
        Eggs myEggs;
        //create
        myEggs = new Eggs();


        //input
        eggsno = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many eggs you have"));


		myEggs.setEggsno(eggsno);

		myEggs.computeBoxes();
		myEggs.computeRemainder();

		boxes = myEggs.getBoxes();
		remainder = myEggs.getRemainder();



		//output
		JOptionPane.showMessageDialog(null, "The number of boxes needed = " + boxes);
		JOptionPane.showMessageDialog(null, "The number of eggs left over = " + remainder);

        }
}