package dk.gruppe5.drone;

import java.awt.Canvas;

import de.yadrone.base.ARDrone;
import de.yadrone.base.IARDrone;
import de.yadrone.base.command.CommandManager;

public class Test extends Canvas {
	
	IARDrone ar;
	CommandManager cmd;
	
	public Test() {
		
		try {
			ar = new ARDrone();
			ar.start();
			cmd = ar.getCommandManager();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		takeOffAndLand(3000);
		
		
		
		
	}
	
	public void takeOffAndLand(long interval) {
		cmd.takeOff();
		cmd.waitFor(interval);
		cmd.landing();
	}

}
