/*
CoinToss.java
@author JFS
06-05-22
*/
public class CoinToss{
	//data members
	private double T1, T2, T3;
	private String Toss1, Toss2, Toss3;
	int Tscore;


	//constructor
	public CoinToss(){
		Tscore = 0;
	}
	//No set methods needed
	//My other methods
	//this assigns either heads or tails to the variables
	public void assign(){
		//this tosses the coin and assigns either heads or tales
			T1 = Math.random();  // Math.random() gives a number between 0 and 1
			T2 = Math.random();
			T3 = Math.random();
			if(T1 > 0.5){ //if the value of the T1 is grater than 0.5 it assigns heads to Toss1
				Toss1 = "Heads";
			}else{
				Toss1 = "Tails"; //if the value of the T1 is any other number it assigns Tails to Toss1
			}
			if(T2 > 0.5){
				Toss2 = "Heads";
			}else{
				Toss2 = "Tails";
			}
			if(T3 > 0.5){
				Toss3 = "Heads";
			}else{
				Toss3 = "Tails";
			}
	}
	//this method is used to give the user points
	public void points(){
		//checks to make sure all tosses = heads
		if(Toss1.equals("Heads") && Toss2.equals("Heads") && Toss3.equals("Heads")){
			//ads 50 to the total score
			Tscore += 50;
		//checks to make sure all tosses = tails. .equals is used when checking if strings equal one another
		}else if(Toss1.equals("Tails") && Toss2.equals("Tails") && Toss3.equals("Tails")){
			//takes 50 from the total score
			Tscore += -50;
		}else{
			//adds 20 to the total score if both if statments above are false
			Tscore += 20;
		}
	}

	//get methods one for every output
	//returns the vaule when it is called upon in the App class
	public String getToss1(){
		return Toss1;
	}
	public String getToss2(){
		return Toss2;
	}
	public String getToss3(){
		return Toss3;
	}

	public int getTscore(){
		return Tscore;
	}
}