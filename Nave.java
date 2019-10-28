package Space;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Nave {

	private BufferedImage desenho;
	
	private int x;
	
	public Nave() {
		try {
			desenho = ImageIO.read(new File("imagens/falcon.png"));
		} catch (IOException e) {
			System.out.print("Não foi possivel carregar a imagem da nave");	
			e.printStackTrace();
		}
		
		x = 683;
	}
	
	public void pintar(Graphics2D g) {
		g.drawImage(desenho, x, 500, x + 100, 100 + 500, 0, 0, desenho.getWidth(), desenho.getHeight(), null);
	}
	
	public void movimenta() {
		
		
	}
}
