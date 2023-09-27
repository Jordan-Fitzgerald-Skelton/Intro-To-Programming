/*
GameApp.java
@author JFS
11-03022
*/


import java.util.Scanner;

public class GameApp{
	public static void main(String args[]){
		int uGuess, cGuess, uScore, cScore;
		String msge, comp, user; //store head/tails of guess

		Scanner scan = new Scanner(System.in);

		CoinToss myCT = new CoinToss();
		uScore = 0;
		cScore=0;
		for(int i = 1; i <=5; i++){ //5 tries
			//ask for uGuess
			System.out.println("Enter 1 for heads, 2 for tails");
			uGuess = scan.nextInt();
			//set uGuess
			myCT.setUGuess(uGuess);
			//set cGuess
			myCT.setCGuess();
			//call compute()
			myCT.compute();
			//get cGuess
			cGuess = myCT.getCGuess();
			//get msge
			msge = myCT.getMsge();
			//output info + calc score
			if(msge.equals("You win")){
				uScore++;

			}else{
				cScore++;
			}
			//wording for user
			if(uGuess ==1){
				user = "heads";
			}else{
				user = "tails";
			}

		}//end loop

		System.out.println("User score is " +uScore+" and comp score is "+cScore); }
}

