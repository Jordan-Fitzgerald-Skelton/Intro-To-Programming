/*
Dress.java
@Author JFS
10-03-22
*/


public class Dress{
	//data members
	private int price;
	private int D;
	private int cost;

	public Dress(){
		price = 15;
		cost = 0;
	}

	//set method - one for every input
	public void setD(int D){
		this.D = D;
	}
	public void compute(){
		cost = D * price;
	}

	public int getCost(){
		return cost;
	}
}