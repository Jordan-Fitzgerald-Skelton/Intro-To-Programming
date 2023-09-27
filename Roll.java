/*
Roll.java
@author JFS
03-03-22
*/

public class Roll {

	private int dice1, dice2;
	private String message;
	//int dice1 = (int)(Math.random()*6)+1;
	//constructor
	public Roll(){
		dice1 = 0;
		dice2 = 0;
		message = "";
	}

	public void rollDice(){
		dice1 = (int)(Math.random()*6)+1;
		dice2 = (int)(Math.random()*6)+1;

		if(dice1 == dice2){
			message = "Double!! dice1; " +dice1+ " dice2 " +dice2;
		}else if (dice1 != dice2){
			message = "not doubles, dice1;" +dice1+ " dice2:" +dice2;
			}

		}


	//set method - one for every input
	public String getMessage(){
		return message;
		}
	//other methods

	//get method - one for every output

	}