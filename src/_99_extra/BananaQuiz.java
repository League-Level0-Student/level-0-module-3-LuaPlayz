//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like puppies
		String answer=JOptionPane.showInputDialog("DO YOU LIKE PUPPIES MY CHILD!??!?! (NOTE: There are different answers for no, yes, and other. If you want the no answer just type no, same for all of the others.");
		//2. if they say no, 
		if(answer.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "YOU ARE A PSYCHOPATH MY CHILD!");
			System.exit(0);
		}
		//tell them they are crazy 
		//and end quiz
	
	//3. if they say yes
	//	ask them what is their favorite hobby
	//	show a pop up that says "<your hobby> is much better with puppies!
		else if (answer.equalsIgnoreCase("Yes")){
			String hobby=JOptionPane.showInputDialog("GREAT! NOW WHAT'S YOUR FAVORITE HOBBY?");
			JOptionPane.showMessageDialog(null, hobby + " IS SO MUCH BETTER WITH PUPPIES!!!");
		}

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
		else {
			JOptionPane.showMessageDialog(null, "MY CHILD! THAT IS NOT A SUITABLE ANSWER FOR THIS QUESTION!!!");
			
		}
	}

}
