/*
First.java
@author JFS
11/02/22
*/

public class First{
	//data members
	private String name;
	private int num;

	//constructurs
	public First(){
		name = "";
		System.out.println("Constructor employed");
		num = 3;
	}

	//set method - one for every input
	//how i can get data into my data member
	public void setName(String name){
		this.name = name;

	}

	//my other methods
	public void printFirst(){
		//code for my method
		System.out.println("First Java class " + name);

	}

	//get method - one for every output
	public String getName(){
		return name;
	}
}