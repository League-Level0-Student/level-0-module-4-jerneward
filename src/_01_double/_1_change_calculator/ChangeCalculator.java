package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String five = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
double nickels = Double.parseDouble(five);
		// Ask the user how many dimes they have, and convert their answer
String ten = JOptionPane.showInputDialog("How many dimes do you have?");
double dimes = Double.parseDouble(ten);
		// Ask the user how many quarters they have, and convert their answer
String twentyfive = JOptionPane.showInputDialog("How many quarters do you have?");
double quarters = Double.parseDouble(twentyfive);
		// Calculate how much money the user has.  Hint: Use a double variable 
double money = nickels/20 + dimes/10 + quarters/4;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, "$" + money);
	}
}

