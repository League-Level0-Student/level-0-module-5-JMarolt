import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
Robot rob = new Robot();
		//2. Set the speed to 100
rob.setX(50);
rob.setY(525);
rob.setSpeed(100);
rob.penDown();
		int colorChoice=JOptionPane.showOptionDialog(null, "Choose", "Colors", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue", "Orange", "Yellow", "Purple"}, 0);
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		if(colorChoice == 0) {
			rob.setPenColor(255, 0, 0);
		}
		if(colorChoice == 1) {
			rob.setPenColor(0, 255, 0);
		}
		if(colorChoice == 2) {
			rob.setPenColor(0, 0, 255);
		}
		if(colorChoice == 3) {
			rob.setPenColor(255, 119, 0);
		}
		if(colorChoice == 4) {
			rob.setPenColor(255, 255, 0);
		}
		if(colorChoice == 5) {
			rob.setPenColor(170, 0, 255);
		}
	
		
		//4. Ask the use how many polygons they want to be drawn.
		String ask = JOptionPane.showInputDialog("How many polygons do you want the robot to make?");
		//5. Use the robot to draw the number of polygons the user requested.
	for(int i3 = 0; i3 < 4; i3++) {
		for(int i2 = 0; i2 < 5; i2++)	{
		for(int i = 0; i <4; i++) {
			
			rob.move(50);
			rob.turn(90);
		}
	
	rob.move(100);
	}
	rob.turn(90);
	rob.move(50);
	}
		//6. Make it so your shapes do not overlap

	
		//7. Challenge: add more colors to the Option Dialog.
	}
}

