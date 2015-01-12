package gui;

import javax.swing.*;

public class Hello extends JFrame {
	public Hello () { //code below is executed when a new Hello object is instantiated
		super("What up fool"); //uses the superclass constructor JFrame(String title) to create a title for the window
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //calls superclass method that allows exiting window when close btn clicked
		super.add(new JLabel("Wub wubbity wub wubbity wub wubbity wub wubbity wub")); //body of the message
		//JFrame inherits from Container superclass
		super.pack(); //adjusts window size to fit its components. JFrame inherits method from Window superclass
		super.setVisible(true); //makes window(the JFrame) visible. now program won't terminate if main method is exited 
		//because the AWT event dispatching thread remains active until all top-level Swing windows have been closed
	}
	
	public static void main(final String [] args) {
		new Hello();
	}

}
