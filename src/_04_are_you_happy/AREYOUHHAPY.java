package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AREYOUHHAPY {
public static void main(String[] args) {
String answer1=JOptionPane.showInputDialog(null, "ARE YOU HAPPY MY CHILD???");
if (answer1.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "KEEP DOING WUTEVER YOU R DOING MY CHILD!!!");
}else if (answer1.equalsIgnoreCase("no")) {
String answer2=JOptionPane.showInputDialog(null, "DO YOU WANT TO BE HAPPY MY CHILD???");
if (answer2.equalsIgnoreCase("yes")){
	JOptionPane.showMessageDialog(null, "THEN CHANGE SOMETHING MY CHILD!!!!!!");
}else if (answer2.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null, "KEEP DOING WUTEVER YOU R DOING MY CHILD!!!");
}


	
	
}

}
}

