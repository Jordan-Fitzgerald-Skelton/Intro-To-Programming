/*
TemplateApp.java
@author BSHC1
2022
*/
import javax.swing.JOptionPane; //JOptionPane import
import java.util.Scanner; //Scanner import

public class TemplateApp{
	//main method
	public static void main(String args[]){
		//declare vars
		String varName;

		//declare and create my objects
		//TemplateClass myObjVariableName = new TemplateClass(String name);

		TemplateClass myTemplate; //declare
		myTemplate = new TemplateClass(); //create

		Scanner keyboard = new Scanner(System.in);

		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number via JOptionPane"));

		System.out.println("Enter varName");  //ask for input
		varName = keyboard.next();			  //use Scanner to accept data
		myTemplate.setVarName(varName);       //call set method to send data to the Obj


	}

}