package applets;

import java.applet.Applet;
import java.awt.Color;

public class SimpleApplet extends Applet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String text = "I am here";
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		setBackground(Color.CYAN);
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("start");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
		System.out.println("stop");
	}
	

}
