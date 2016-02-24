package dk.gruppe5.drone.framework;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyInput implements KeyListener {
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_SPACE) {
			//test.takeOffAndLand(3000);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
