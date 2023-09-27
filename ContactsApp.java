/*
ContactsApp.java
@author JFS
25-02-22
*/

import javax.swing.JOptionPane;

public class ContactsApp{
    public static void main(String[] args) {

		String name1, name2, name3;
		int number1, number2, number3;
		String email1, email2, email3;


		//contact1
		name1 = JOptionPane.showInputDialog(null, "Enter the contacts name");
		number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the phone number "));
		email1 = JOptionPane.showInputDialog(null, "Enter the contacts email");

		//contact 3
		name2 = JOptionPane.showInputDialog(null, "Enter the contacts name");
		number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the phone number "));
		email2 = JOptionPane.showInputDialog(null, "Enter the contacts email");

		//contact 3
		name3 = JOptionPane.showInputDialog(null, "Enter the contacts name");
		number3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the phone number "));
		email3 = JOptionPane.showInputDialog(null, "Enter the contacts email");





				//output
		JOptionPane.showMessageDialog(null, "Contact 1 ");
		JOptionPane.showMessageDialog(null, "Name;" + name1 + "number; " + number1 + "email; " + email1);

		JOptionPane.showMessageDialog(null, "Contact 1 ");
		JOptionPane.showMessageDialog(null, "Name;" + name2 + "number; " + number2 + "email; " + email2);

		JOptionPane.showMessageDialog(null, "Contact 3 ");
		JOptionPane.showMessageDialog(null, "Name;" + name3 + "number; " + number3 + "email; " + email3);






	}
}