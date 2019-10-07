import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SI extends JPanel{
	JLabel player = new JLabel("a");
	
	public SI(){
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		
		player.setForeground(Color.blue);
		
		player.setBounds(250,400,20,20);
		
		add(player);
	}
	public void DefinirEventos() {
		
	}
	
	public static void main(String args[]) {
		JFrame frame = new JFrame();	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new SI());
		frame.setBounds(0,0,500,500);
		frame.setVisible(true);
		
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
			      KeyStroke.getKeyStroke("A"), "myAction");
			    
			    frame.getRootPane().getActionMap().put("myAction", new AbstractAction() {
			        public void actionPerformed(java.awt.event.ActionEvent e) {
			            System.out.println("Funfou");
			        }
			    });
	}
	
}
