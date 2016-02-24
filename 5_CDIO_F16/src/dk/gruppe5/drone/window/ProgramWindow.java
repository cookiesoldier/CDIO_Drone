package dk.gruppe5.drone.window;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import dk.gruppe5.drone.Test;

public class ProgramWindow {
	
	public ProgramWindow(String title, int w, int h) {
		
		Test test = new Test();
		
		JFrame frame = new JFrame(title);
		frame.setMaximumSize(new Dimension(w, h));
		frame.setMinimumSize(new Dimension(w, h));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

}

