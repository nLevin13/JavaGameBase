package Test2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Texture extends JPanel {
	
	private Image image;
	
	public Texture(String img) {
		super(null);
		image = ImportManager.getImage(img);
	}
	
	@Override
	public void paintComponent(Graphics g){
		//super.paintComponent(g);
		System.out.println("canana");
		g.drawImage(image, 0, 0, this);
	}
	
}
