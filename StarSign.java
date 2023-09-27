/*
StarSign.java
@author JFS
09-03-22
*/

public class StarSign{
	//data members
	int date;
	String month;
	String starsign;

	//construcot
	public StarSign(){
		date = 0;
		}
	//set method - one for every input
	public void setDate(int date){
		this.date = date;
		}
	public void setMonth(String month){
		this.month = month;
		}

	public void compute(){
		if(month.equals("January")){
			if(date>1  && date <19){
				starsign = "Capricon";
			}else{
				starsign = "Aquarius";
			}
		}else if (month.equals("Febuary")){
			if(date>1  && date <18){
				starsign = "Aquarius";
			}else{
				starsign = "Pisces";
			}
		}else if(month.equals("March")){
			if(date>1  && date <20){
				starsign = "Pisces";
			}else{
				starsign = "Aries";
			}
		}else if(month.equals("April")){
			if(date>1  && date <19){
				starsign = "Aries";
			}else{
				starsign = "Taurus";
			}
		}else if(month.equals("May")){
			if(date>1  && date <20){
				starsign = "Taures";
			}else{
				starsign = "Gemini";
			}
		}else if(month.equals("June")){
			if(date>1  && date <20){
				starsign = "Gemini";
			}else{
				starsign = "Cancer";
			}
		}else if(month.equals("July")){
			if(date>1  && date <22){
				starsign = "Cancer";
			}else{
				starsign = "Leo";
			}
		}else if(month.equals("August")){
			if(date>1  && date <22){
				starsign = "Leo";
			}else{
				starsign = "Virgo";
			}
		}else if(month.equals("September")){
			if(date>1  && date <22){
				starsign = "Virgo";
			}else{
				starsign = "Libra";
			}
		}else if(month.equals("October")){
			if(date>1  && date <22){
				starsign = "Libra";
			}else{
				starsign = "Scorpio";
			}
		}else if(month.equals("November")){
			if(date>1  && date <21){
				starsign = "Scorpio";
			}else{
				starsign = "Sagittarius";
			}
		}else if(month.equals("December")){
			if(date>1  && date <21){
				starsign = "Sagittarius";
			}else{
				starsign = "Capricorn";
			}
		}else{

		}
		}
		public String getStarsign(){
					return starsign;
		}
	}