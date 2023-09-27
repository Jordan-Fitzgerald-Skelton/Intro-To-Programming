/*
RevisionWeek3.java
@author JFS
10/02/2022
*/

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class RevisionWeek3{
	public static void main(String args[]){

		int studentno, teamno, extra;



		studentno = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age "));

		teamno = studentno / 4 ;
		extra = studentno % 4;

		//outputs

		System.out.println("Number of teams = " + teamno);
		System.out.println("Number of students left over = " + extra);

		/*

		Scanner teams;
		teams = new Scanner(System.in);

		//inputs
		System.out.print("Enter the number of students ");
		studentno = teams.nextInt();

		//process
		teamno = studentno / 4 ;
		extra = studentno % 4;


		//outputs

		System.out.println("Number of teams = " + teamno);
		System.out.println("Number of students left over = " + extra);

		*/
	}
}
