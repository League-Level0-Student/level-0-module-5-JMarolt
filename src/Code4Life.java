/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class Code4Life {
	
	public static void main(String[] args) {
	/*
     * Ask the user how many hours they spent coding this week.
     * 
     * 1. If it's 3 or more, tell them they're a Code Ninja.
     * 
     * 2. If it's less than 2, tell them to stop watching YouTube and write code instead.
     * 
     * 3. If it's more than 5, play the Batman theme song.
     */

	String ask = JOptionPane.showInputDialog("How many hours of coding do you do a week?");

	int i = Integer.parseInt(ask);
	
			if(i < 3) {
				JOptionPane.showMessageDialog(null, "Stop watching youtube and write code!");
			}
	
if(i > 2 && i < 5) {
	JOptionPane.showMessageDialog(null, "You're a code ninja");
}
if(i > 4) {
	JOptionPane.showMessageDialog(null, "Batman Theme Song");
}
//    private static void playBatmanTheme() {
    	try {
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(AudioSystem.getAudioInputStream(Code4Life.class.getResource("batman.wav")));
   		 clip.start();
   		 Thread.sleep(60002);
    	}catch (Exception ex) {
     	ex.printStackTrace();
   	}
    }

}
//}