/*
CardGame.java
@author JFS
27-04-22
*/
public class CardGame{
	//data members
	private int sum, points;
	private int gameCards[] = new int[4];

	//set methods one for every input

	//constructor
	public CardGame(){
		sum = 0;
		points = 0;
	}

	// my other methods
	public void genCards(){
		for(int i = 0; i < gameCards.length; i++){
			gameCards[i]= 1 + (int)(Math.random() * 13);
		}
	}

	public void calPoints(){//checks they are the same
		if((gameCards[0] == gameCards[1]) && (gameCards[1] == gameCards[2]) && (gameCards[2] == gameCards[3])){
			points =+ 30;
		}
		//gets the sum
		for(int i = 0; i < gameCards.length; i++){
			sum = sum + gameCards[i];
			points = points + gameCards[i];
		}
		//adds 50 if sum is less that 10
		if(sum < 10){
			points =+ 50;
		}
	}

	//get methods one for every output
	public int[] getCards(){
		return gameCards;
	}
	public int getPoints(){
		return points;
	}
}