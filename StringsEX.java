/*
StringsEX.java
@author JFS
25-03-2022
*/

public class StringsEX{
	public static void main(String args[]){
		String word = "passsword";
		/*
		for(int i = 0; i < word.length(); i++){
			//action
			System.out.println(word.charAt(i));
		}
		System.out.println(" charAt(1) = " + word.charAt(1));

		*/
		String bigWord = word.toUpperCase();
		System.out.println(bigWord);
		System.out.println("word".toUpperCase());

		int len = word.length();

		String substr = word.substring(len - 3, len);
		System.out.println("Substring Ex; " + substr);
	}



}