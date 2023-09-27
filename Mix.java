/*
Mix.java
@author JFS
06-04-2022
*/

public class Mix{
	//data members
	private String word;
	private String newWord;
	private StringBuffer strBuff; //declared

	//constructor
	public Mix(){
		word = " ";
		newWord = " ";
	}

	//set methods
	public void setWord(String word){
		this.word = word;
	}

	//my other methods
	public void compute(){
		strBuff = new StringBuffer();

		strBuff.append(word.charAt(word.length() - 1));

		for(int i= 1; i < word.length() - 1; i++){
			strBuff.append(word.charAt(i));
		}
		strBuff.append(word.charAt(0));
		newWord = strBuff.toString();
	}

	//get method
	public String getNewWord(){
		return newWord;
	}


}