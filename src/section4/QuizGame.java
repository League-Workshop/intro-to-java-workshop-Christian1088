package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String answer=JOptionPane.showInputDialog("How many Super Bowls have the Broncos won?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("three")) {
		// 4.  if the user's answer is correct
		score++;
		// -- add one to their score 
		JOptionPane.showMessageDialog(null, "you are correct");
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		JOptionPane.showInputDialog("Are the Broncos a football team");
		
		if(answer.equals("yes")) {
			score++;
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showInputDialog(null, "your score is");
	}
}
