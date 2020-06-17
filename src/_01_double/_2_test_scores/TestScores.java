package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What was your test score?");
		double score = Double.parseDouble(input);
		if(score > 7) {
			JOptionPane.showMessageDialog(null, "Wow that's a great score! You must really know your stuff, good job!");
		}
		else {
		JOptionPane.showMessageDialog(null, "You could do better. Maybe try studying more next time. You got it!");
	}
}}
