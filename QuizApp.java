/*
QuizApp.java
@author JFS
13-04-2022
*/
import javax.swing.JOptionPane;
public class QuizApp{
	public static void main(String args[]){
		boolean repeat = true;
		String runagain = "";
		int sno;
		double results[][] = new double[3][10];
		double min;
		double max;


		Quiz myQuiz = new Quiz();

		for(int row = 0; row < results.length; row++){
			for(int col = 0; col < results[row].length; col++){
				results[row][col] = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter name for the cell["+row+"]["+col+"]"));
			}
		}


		myQuiz.setResults(results);
		myQuiz.MinMax();

		JOptionPane.showMessageDialog(null, "max =" + myQuiz.getMax() +"and min =" + myQuiz.getMin());


		runagain = JOptionPane.showInputDialog(null,"Do you want to run the program again? Yes or No");
		if (runagain.equalsIgnoreCase("no")) {
			repeat = false;
		}
	}
}