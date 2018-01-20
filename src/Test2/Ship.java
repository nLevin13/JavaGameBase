package Test2;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class Ship extends Node {

	public Ship(Node theParent,
			Rectangle rect) {
		super(true, "ship", theParent, rect);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("wtf");

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("wtf2");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void initChildren() {
		this.add(new Texture("ship"));
		//this.getComponents()[0].repaint();

	}

	@Override
	public void tickAction() {
		// TODO Auto-generated method stub

	}

}
