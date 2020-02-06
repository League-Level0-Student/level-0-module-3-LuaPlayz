//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _02_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many dogs they have
String answer=JOptionPane.showInputDialog(null, "HOW MANY DOGS DO YOU HAVE MY CHILD");
		// 2. Convert their answer into an int
int numbofdogs= Integer.parseInt(answer);
		// 3. If they have 3 or more dogs, tell them they are a crazy dog lady
if (numbofdogs>2) {
	JOptionPane.showMessageDialog(null, "YOU ARE A CRAZYYY DOG LADY!!!");
	
}
		// 4. If they have less than 3 dogs AND more than 0 dogs, call the method below to show them a dog video
if (numbofdogs<3&&numbofdogs>0) {
	playVideo("https://www.youtube.com/watch?v=AcL0MeVZIxM");
}
		// 5. If they have 0 dogs, show them a video of A Frog Sitting on a Bench Like a Human
if (numbofdogs==0) {
	playVideo("https://www.youtube.com/watch?v=ZJT9CeEhM10");
	
}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

