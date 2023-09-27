/*
GuessingGame.java
@author JFS
23-03-22
*/
public class GuessingGame{
	//data members
	private int snum, guess;
	private String message;

	//constructurs
	public GuessingGame(){
		snum = 0;
		guess = 0;
	}
	//set method - one for every input
	//how i can get data into my data member

	public void setSnum(int snum){
		this.snum = snum;
	}

	public void setGuess(int guess){
		this.guess = guess;
	}


	//my other methods
	public void computeMessage(){
		//body of my method - action
		if(snum ==guess){
		   message = "Congratulations, you guessed correctly!";
		}else if(snum < guess){
			message = "You guessed too high, sorry!";
		}else{
			message = "You guessed too low, sorry";
		}

	}

	//get method - one for every output
	public String getMessage(){
		return message;
	}


}

