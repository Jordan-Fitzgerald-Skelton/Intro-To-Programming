/*
Box.java
@author JFS
18/02/22
*/

public class Box{
	//data members
	private double width;
	private double length;
	private double height;
	private double volume;
	private double area;

	//constructurs
	public Box(){
		width = 0;
		length = 0;
		height = 0;
		area = 0;
		volume = 0;
	}

	//set method - one for every input
	//how i can get data into my data member

	public void setWidth(double width){
		this.width = width;
	}

	public void setLength(double length){
		this.length = length;
	}

	public void setHeight(double height){
		this.height = height;
	}

	//my other methods


	public void computeArea(){
		//body of my method - action
		area = length * width;
     }

     public void computeVolume(){
	 	//body of my method - action
	 	volume = length * width * height;
	 }


	//get method - one for every output

	public double getArea(){
		return area;
	}
	public double getVolume(){
		return volume;
	}
}