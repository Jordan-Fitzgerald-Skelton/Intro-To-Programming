/*
Garden.java
@author JFS
18-02-22
*/

	public class Garden{
		//data members
		private int in1, in2, in3, in4;
		private double total;

		//constructurs
		public Garden(){
			in1 = 0;
			in2 = 0;
			in3 = 0;
			in4 = 0;
	}
	//set method - one for every input
	//how i can get data into my data member

	public void setIn1(int in1){
		this.in1 = in1;
	}

	public void setIn2(int in2){
		this.in2 = in2;
	}

	public void setIn3(int in3){
		this.in3 = in3;
	}
	public void setIn4(int in4){
		this.in4 = in4;
	}


	//my other methods
	public void computeTotal(){
		//body of my method - action
		total = (in1 * 35) + (in2 * 5.99) + (in3 * 4.99) + (in4 * 14.99);
	}

	//get method - one for every output
	public double getTotal(){
		return total;
	}


}

