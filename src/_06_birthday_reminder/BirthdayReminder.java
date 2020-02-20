
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String myBirthday = "January 24th";
		String dadsBirthday = "January 19th";
		String momsBirthday= "March 9th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String name= JOptionPane.showInputDialog(null, "WHICH BDAY DO YOU WANT TO FIND OUT MY CHILD???");
		// 3. Print out what the user typed
		
	// 6. if user asked for your name
				// print myBirthday
		if (name.equalsIgnoreCase("my")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
			
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (name.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		
		// 4. if user asked for "mom"
		//print mom's birthday
		else if (name.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "I DO NOT KNOW OF THAT BDAY MY CHILD!!!");
		}
	} 
}
