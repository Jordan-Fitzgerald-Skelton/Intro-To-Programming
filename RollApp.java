/*
RollApp,java
@author JFS
03-03-22
*/

public class RollApp{
	public static void main(String args[]){
		String message;


		Roll myRoll;
		myRoll = new Roll();

		System.out.println("Rolling dice");
		myRoll.rollDice();
		//option1
		//message = myRoll.getMessage();
		//System.out.println(message);
		//option 2
		System.out.println(myRoll.getMessage());
		}

	}