/*
 *Replace.java
 *@author JFS
 *01-04-2022
 */

 public class PigLatin{
	 private String word;
	 private String plword;
	 private StringBuffer sb;
	 private int len;
	 public PigLatin(){
		 word = " ";
		 plword = " ";
		 sb = new StringBuffer();
		 len = word.length();
	}

	public void setWord(String word){
		this.word = word;
	}

	public void compute(){
		for(int i = 1; i <= len; i++){
			sb.append(word.charAt(i));
		}
		plword = sb.append(word.charAt(0));
		plword = sb.append("ay");
		plword.toString();
	}

	public String getPlword(){
		return plword;
	}
}