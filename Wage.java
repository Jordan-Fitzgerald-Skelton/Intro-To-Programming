/*
Wage.java
@author JFS
17/ 02/2022
*/
public class Wage{// Data Members
	private double hours;
	private double rate;
	private double wage;


	//Constructor
	public Wage(){
		hours = 0;
		rate = 0;
		wage = 0;
	}
     // set methods      //Perameters go in the brackets
     public void setHours(double hours){
		this.hours = hours;
     }
     public void setRate(double Rate){
		 this.rate = rate;
		 }

     //my other methods

	public void computeWage(){
		//body of my method - action
		wage = rate * hours;
     }
     //get method

     public double getWage(){
		return wage;
     }
}
