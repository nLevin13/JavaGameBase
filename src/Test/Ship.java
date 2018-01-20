package Test;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Ship extends JPanel implements MouseListener,MouseMotionListener{

	int x,y,count;
	public Ship() {
		GUI j = new GUI();
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.setLayout(null);
		this.add(j);
		//j.setBounds(50, 75, 100, 75);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("hi");
		
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
	
	@Override
	public void paint(Graphics g){
		Image offImage = createImage(1000, 1000);
        Graphics buffer = offImage.getGraphics();
        paintOffScreen(buffer);
        g.drawImage(offImage, 0, 0, null);
	}

	private void paintOffScreen(Graphics buffer) {
		buffer.fillRect(10, 10, 60, 74);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		x = arg0.getX();
		y = arg0.getY();
		this.getComponent(0).setLocation(x, y);
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
		this.repaint();

	}
}
