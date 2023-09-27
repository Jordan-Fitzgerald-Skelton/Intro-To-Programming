/*
Shirst.java
@Author JFS
10-03-22
*/


public class Shirts{
	//data members
	private int price;
	private int S;
	private int cost;

	public Shirts(){
		price = 10;
		cost = 0;
	}

	//set method - one for every input
	public void setS(int S){
		this.S = S;
	}
	public void compute(){
		cost = S * price;
	}

	public int getCost(){
		return cost;
	}
}