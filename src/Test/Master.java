package Test;

import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Master {

	public static void main(String[] args){
		JFrame tutorialLevel = new JFrame("SpaceBase Redesign");
		tutorialLevel.setVisible(true);
		tutorialLevel.setSize(1000, 1000);
		Ship e = new Ship();
		//tutorialLevel.getContentPane().setLayout(null);
		tutorialLevel.add(e);
		//e.setBounds(200, 200, 500, 500);
		tutorialLevel.addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(WindowEvent evt)
            {
                System.exit(0);
            }
        });
	}

}
