package Test2;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GUI2 extends JFrame implements ActionListener {

	public GUI2() {
		super("SpaceBase Redesign");
		setVisible(true);
		setSize(1000,1000);
		JPanel e = new Texture("ship");
		add(e);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		Timer timer = new javax.swing.Timer(1000, this);
        timer.start();		// timer starts here
	}
	
	@Override
	public void paint(Graphics g){
		this.paintComponents(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
		
	}
	
}
