package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class KidsLogin {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KidsLogin window = new KidsLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public KidsLogin() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
