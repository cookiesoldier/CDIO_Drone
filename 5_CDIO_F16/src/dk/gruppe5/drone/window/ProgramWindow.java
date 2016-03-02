package dk.gruppe5.drone.window;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import de.yadrone.base.ARDrone;
import dk.gruppe5.drone.Test;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class ProgramWindow {
	
	public ProgramWindow(String title, int w, int h) {
		
		Test test = new Test();
		
		//JFrame frame = new JFrame(title);
		VideoListener frame = new VideoListener((ARDrone) test.drone);
		NavDataListener nav = new NavDataListener((ARDrone) test.drone);
		frame.setMaximumSize(new Dimension(w, h));
		frame.setMinimumSize(new Dimension(w, h));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		frame.setVisible(true);
		
	}

}

