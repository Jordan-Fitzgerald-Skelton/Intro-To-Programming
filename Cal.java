/*
cal.java
@author JFS
11/02/22
 */

public class Cal {// Data Members
	private double num1, num2;
    private double sum;
  	private double difference;
  	private double mult, div, modulo;

	//Constructor
	public Cal(){
		num1 = 0;
		num2 = 0;
		sum = 0;
		difference = 0;
		mult = 0;
		div = 0;
		modulo = 0;
	}
     // set methods      //Perameters go in the brackets
     public void setNum1(double num1){
		this.num1 = num1;
     }
     public void setNum2(double num2){
		this.num2 = num2;
     }

     //my other methods
    public void computeMult(){
		mult = num1 * num2;
	}
	public void computeDiv(){
		div = num1 / num2;
	}
	public void computeModulo(){
		modulo = num1 % num2;
	}
	public void computeSum(){
		//body of my method - action
		sum = num1 + num2;
     }
	public void computeDifference(){
		difference = num1 - num2;
     }

     //get method

     public double getSum(){
		return sum;
     }
     public double getDifference(){
		return difference;
     }
     public double getMult(){
	 		return mult;
     }
     public double getDiv(){
	 		return div;
     }
     public double getModulo(){
	 		return modulo;
     }
}
