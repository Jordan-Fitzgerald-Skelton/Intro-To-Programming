/*
FirstApp.java
@author JFS
11/02/22
*/

public class FirstApp{
	//main method
	public static void main(String args[]){

		//declare and create an instance of first.java
		First myFirst; //declaring
		myFirst = new First(); //creating and using the constructor

		String name; //empty

		myFirst.setName("Jordan");

		myFirst.printFirst();

		name = myFirst.getName(); //name has data in it noe

		System.out.println(name);



	}
}