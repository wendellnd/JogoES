package Space;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class SpaceInvaders extends JPanel implements Runnable, KeyListener{
	
	private Nave nave;
	private int move;
	
	public SpaceInvaders() {
		
		nave = new Nave();
		
		Thread lacoDoJogo = new Thread(this);
		lacoDoJogo.start();
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
	
	int x = 0;
	
	public void paintComponent(Graphics g2) {
		super.paintComponent(g2);
		
		Graphics2D g = (Graphics2D) g2.create();
		g.setRenderingHint(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(
				RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		
		
		g.setColor(Color.blue);
		g.fillRect(x++, 0, 50, 50);
		
		nave.pintar(g);
	}
	public void dorme() {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_D) {
			
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
