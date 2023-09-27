/*
PartyApp.java
@author JFS
25-02-22
*/

import.javax.JOptionPane;
public class PartyApp{
	public static void main(String args[]){
		//declare data memebers
		int eventType;
		boolean chiceIsGood;

		//declare our object


		//create our object

		eventType = Integer.parseInt(JOptionPane.showInputDialog(null, "enter 1 for private and 2 for private "));


		if(eventType ==1){
			choiceIsGood = true
		}else if(eventType == 2){
			choiceIsGood = true;
		}else{
			choiceIsGood = false;
		}

		if (choiceIsGood){
			//set the event type
			//call method project details()
			//use getter to display
			JOptionPane.showMessageDialog(null, "Manager is" + myEvent.getManager());
			//use getter to show the rate info
		}else{
			//ket user know the invalid chpice
		}


		}
	}