/*
Conver.java
@author JFS
23-02-22
*/

	public class Conver{
		//data members
		private double in1;
		private double cel;
		private double fah ;


		//constructurs
		public Conver(){
			in1 = 0;

	}
	//set method - one for every input
	//how i can get data into my data member

	public void setIn1(double in1){
		this.in1 = in1;
	}

	public void computeCel(){
		cel = (in1 -32) * 5/9;
		}

	public void computeFah(){
		//body of my method - action
		fah = (in1 * 1.8)+ 32;
	}

	//get method - one for every output
	public double getCel(){
		return cel;
	}
	public double getFah(){
		return fah;
	}

}

