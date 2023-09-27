/*

*/
import javax.swing.JOptionPane;

public class SalePrice{
   public static void main(String[] args){
	   double currentPrice, salePrice, discount;
	   int discountRate;

	   currentPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Current price"));
	   discountRate = Integer.parseInt(JOptionPane.showInputDialog(null, "% discount rate"));

	   discount = (currentPrice * discountRate)/100;
	   salePrice = currentPrice - discount;

	   JOptionPane.showMessageDialog(null, "Sale price is " + salePrice);


   }
}