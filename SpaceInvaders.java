package Space;

import java.awt.*;

import javax.swing.*;

public class SpaceInvaders extends JPanel implements Runnable{
	
	public SpaceInvaders() {
		Thread lacoDoJogo = new Thread(this);
	}
	
	public void run() {
		
		while(true) {
			update();
			repaint();
			dorme();
		}
	}
	public void update() {
		
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(0, 0, 50, 50);
	}
	public void dorme() {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
