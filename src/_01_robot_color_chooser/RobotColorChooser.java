//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot robot=new Robot();
		   for (int g = 0; g < 100000000; g++) {
			
		
		//3. Ask the user what color they would like the robot to draw
		String color= JOptionPane.showInputDialog(null, "WHAT COLOR DO YOU WANT THE MAGESTIC ROBOT TO DRAW WITH MY CHILD???");
		
		//4. Set the pen width to 10
	robot.setPenWidth(10);
	
		//5. Use an if/else statement to set the pen color that the user requested
		
if (color.equals("blue")) {
	robot.setPenColor(Color.blue);
}else if (color.equals("green")) {
	robot.setPenColor(Color.GREEN);
}else if (color.equals("red")) {
	robot.setPenColor(Color.RED);
}else if (color.equals("yellow")) {
	robot.setPenColor(Color.yellow);
}


        //6. If the user doesn’t enter anything, choose a random color

else {
	robot.setRandomPenColor();
}



//2. Make the robot draw a shape (this will take more than one line of code)
robot.penDown();
robot.setSpeed(200);
for(int i=0;i<5; i++) {
robot.move(200);
robot.turn(90);

}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

	}
	}
}
