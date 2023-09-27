/*
Bonus.java
@author JFS
04-03-22
*/

public class Bonus{
	//data members
	final int MIN_ITEMS = 3;
	final int MIN_VALUE = 1000;
	final int SMALL_BONUS = 10;
	final int MED_BONUS = 25;
	final int LGE_BONUS = 50;
	int bonus;
	int itemsold;
	int totalvalue;

	//construcot
	public Bonus(){
		bonus = 0;
		itemsold = 0;
		totalvalue = 0;
		System.out.println("using constructor");
		}
	//set method - one for every input
	public void setItemsold(int itemsold){
		this.itemsold = itemsold;
		}
	public void setTotalvalue(int totalvalue){
		this.totalvalue = totalvalue;
		}

		//other methods
	public void compute(){
		if(itemsold >= MIN_ITEMS){
			if(totalvalue > MIN_VALUE){
				bonus = LGE_BONUS;
			}else{
				bonus = MED_BONUS;
			}


		}else{
			bonus = SMALL_BONUS;
		}
	}


	public int getBonus(){
		return bonus;
		}
}