/*
Quiz.java
@author JFS
13-04-2022
*/
public class Quiz{
	private int sno;
	double results[][];
	double min;
	double max;


	public Quiz(){
		sno = 0;
		results = new double[3][10];
	}

	public void setResults(double results[][]){
			this.results = results;
	}
	public void setSno(int sno){
			this.sno = sno;
	}

	public void MinMax(){
		min = results[0][0];
		max = results[0][0];
		for(int row =  0; row < 3; row++){
			for(int col = 0; col < 10; col++){
				if(results[row][col] < min){
					min = results[row][col];
				}
				if(results[row][col] < max){
					max = results[row][col];
				}
			}
		}
	}

	public double getMin(){
		return min;
	}
	public double getMax(){
		return max;
	}
}