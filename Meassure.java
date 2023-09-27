/*
Meassure.java
@author JFS
15-02-22
*/

public class Meassure{
	private int m, cm;

	//constructor makes an instance
	public Meassure(){
		m = 0;
		cm = 0;

		}
	//set method - one for every input
	public void setM(int m){
		this.m = m;
	}

	//compute - process
	public void compute(){
		cm = m*100;
	}
	//get method - one for every output
	public int getCm(){
		return cm;
	}
}