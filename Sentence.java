/*
Sentence.java
@author JFS
30-03-2022
*/

public class Sentence{
	private String sentence;
	private int spaces;
	private int vowels;
	private int consonants;

	//constructor
	public Sentence(){
		spaces = 0;
		vowels = 0;
		consonants = 0;
	}
	//set method(s) - one for every input
	public void setSentence(String sentence){
		this.sentence = sentence;;
	 }

	//compute method
	public void compute(){
		for(int i = 0; i < sentence.length(); i++ ){
			if(sentence.charAt(i) == ' '){
				spaces ++;
			}
			if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u'){
				vowels ++;
			}
			if(sentence.charAt(i) != 'a' || sentence.charAt(i) != 'e' || sentence.charAt(i) != 'i' || sentence.charAt(i) != 'o' || sentence.charAt(i) != 'u'){
				consonants ++;
			}
		}
	}
	//get methods - one for every output
	public int getSpaces(){
		return spaces;
	}

	public int getVowels(){
		return vowels;
	}

	public int getConsonants(){
		return consonants;
	}


}
