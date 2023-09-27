/*
Swap.java
@author JFS
06-04-2022
*/
public class Swap{
	//data members
	private String sentence, newSentence, substr;
	private StringBuffer sBuff;

	//constructor

	//set method - input
	public void setSentence(String sentence){
		this.sentence = sentence;
	}

	//my other methods
	public void stringSwap(){
		//create sBuff here
		sBuff = new StringBuffer();
		//for loop
		for(int i = 0; i < sentence.length(); i++){
			//get the substring - str.substring(8, 17);
			if((i+3) <= sentence.length()){//check that we are within the length of the string as will get an error if we go over the end!
				substr = sentence.substring(i, i+3);
				//System.out.println(substr +"!!");   //testing line
				//if () to compare
				if(substr.equals("is ")){
					//append is not
					sBuff.append("is not");
					//add to index
					i++;
				}else{
					//append the current character at the index
					sBuff.append(sentence.charAt(i));
				}
			}else{
				//because we had to check that out substr didn't send us over the edge, we need to add those last 2
				sBuff.append(sentence.charAt(i)); //add the last 2 chars
			}

		}
		//toString()
		newSentence = sBuff.toString();
	}

	//get - one for every output
	public String getNewSentence(){
		return newSentence;
	}
}