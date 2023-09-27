/*
Eggs.java
@author JFS
16/ 02/2022
*/
public class Eggs {// Data Members
	private int eggsno;
    private int boxes;
  	private int remainder;

	//Constructor
	public Eggs(){
		eggsno = 0;
		boxes = 0;
		remainder = 0;
	}
     // set methods      //Perameters go in the brackets
     public void setEggsno(int eggsno){
		this.eggsno = eggsno;
     }

     //my other methods

	public void computeBoxes(){
		//body of my method - action
		boxes = eggsno / 12;
     }
	public void computeRemainder(){
		remainder = eggsno % 12;
     }

     //get method

     public int getBoxes(){
		return boxes;
     }
     public int getRemainder(){
		return remainder;
     }
}
