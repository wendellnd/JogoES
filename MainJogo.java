package Space;

import javax.swing.*;

public class MainJogo {
	
	public static void main(String args[]) {
		JFrame frame = new JFrame("");
		frame.setBounds(0,0,1366,768);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		SpaceInvaders spaceInvaders = new SpaceInvaders();
		spaceInvaders.setBounds(0,0,1366,768);
		
		frame.add(spaceInvaders);
		
		frame.setVisible(true);
		
	}
	
}
