package Test2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class GUI {

	public static void main(String[] args) {
		ImportManager i = new ImportManager();
		JFrame level = new GUI2();
		/*level.setVisible(true);
		//level.getContentPane().setLayout(null);
		level.setSize(1000, 1000);
		Node e = new Master();
		level.add(e);
		level.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		while(true)
			level.getComponent(0).getComponentAt(200, 100).getComponentAt(0, 0).repaint();
		*/
	}

}
