/*
Temperature.java
@author JFS
23-02-22
*/

	public class Temperature{
		//data members
		private double in1, in2, in3, in4, in5, in6, in7;
		private double averageC;
		private double averageF;


		//constructurs
		public Temperature(){
			in1 = 0;
			in2 = 0;
			in3 = 0;
			in4 = 0;
			in5 = 0;
			in6 = 0;
			in7 = 0;

	}
	//set method - one for every input
	//how i can get data into my data member

	public void setIn1(double in1){
		this.in1 = in1;
	}
	public void setIn2(double in2){
		this.in2 = in2;
	}
	public void setIn3(double in3){
		this.in3 = in3;
	}
	public void setIn4(double in4){
		this.in4 = in4;
	}
	public void setIn5(double in5){
			this.in5 = in5;
	}
	public void setIn6(double in6){
			this.in6 = in6;
	}
	public void setIn7(double in7){
			this.in7 = in7;
	}

	//my other methods
	public void computeAverageC(){
		//body of my method - action
		averageC= (in1 + in2 + in3 + in4 + in5 + in6 + in7)/ 7;
	}

	public void computeAverageF(){
		//body of my method - action
		averageF = (averageC * 1.8)+ 32;
	}

	//get method - one for every output
	public double getAverageC(){
		return averageC;
	}

	public double getAverageF(){
		return averageF;
	}


}

