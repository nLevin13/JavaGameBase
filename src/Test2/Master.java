package Test2;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class Master extends Node {

	public Master() {
		super(true, "master", null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

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
	protected void initChildren() {
		addChild(new Ship(this, new Rectangle(200,100,500,390)));
	}

	@Override
	public void tickAction() {
		// TODO Auto-generated method stub

	}
	
	public void addChildChild(Node e){
		this.children.put(e.getID(), e);
		this.add(e);
	}
	
}
