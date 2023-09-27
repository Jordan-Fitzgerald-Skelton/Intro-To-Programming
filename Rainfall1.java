/*
 *Rainfall1.java
 *@author F.Sheridan
 *26th Nov 2013
 */

 public class Rainfall1{
	 public static void main(String args[]){
		 int rainfall[][] = {{2,4,3,2,1,1,4},{5,3,1,2,1,3,4},{3,3,2,3,1,1,2},{2,1,3,3,2,1,1}};

		 for(int i = 0; i < rainfall.length; i++){
			 for(int j = 0; j < rainfall[i].length; j++){
				 System.out.print(rainfall[i][j]);
			 }
			 System.out.println();
		 }
	 }
 }