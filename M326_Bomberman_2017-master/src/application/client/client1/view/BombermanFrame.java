package application.client.client1.view;

import javax.swing.JFrame;

public class BombermanFrame extends JFrame {
	public BombermanFrame(BombermanPanel panel) {
		setTitle("Bomberman");
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setVisible(true);
	}

}
