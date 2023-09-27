/*
 *Name.java
 *@author F.Sheridan
 *12th Nov 2013
 */

 public class Name{
	 //declare data members
	 private String name;
	 private int len;
	 private char firstLetter;
	 private char lastLetter;

	 //constructor
	 public Name(){
		 name = " ";
		 len = 0;
		 firstLetter = ' ';
		 lastLetter = ' ';
	 }

	 //set method(s) - one for every input
	 public void setName(String name){
		 this.name = name;
	 }

	 //compute method
	 public void compute(){
		 len = name.length();
		 firstLetter = name.charAt(0);
		 lastLetter = name.charAt(len - 1);
	 }

	 //get methods - one for every output
	 public int getLen(){
		 return len;
	 }

	 public char getFirstLetter(){
		 return firstLetter;
	 }

	 public char getLastLetter(){
		 return lastLetter;
	 }
 }

