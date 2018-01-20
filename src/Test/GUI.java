package Test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI  extends JPanel implements MouseListener,MouseMotionListener{

	public GUI() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.setBounds(50, 75, 100, 75);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("foik");
		this.repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintOffScreen(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(0, 0, 20, 20);
	}
	
	@Override
	public void paint(Graphics g)
    {
        Image offImage = createImage(100, 75);
        Graphics buffer = offImage.getGraphics();
        paintOffScreen(buffer);
        g.drawImage(offImage, 0, 0, null);
    }
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//this.repaint();
		
	}
	
}
