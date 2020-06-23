package Main;

import java.awt.EventQueue;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KidsMap {

	JFrame frame;
	KidsFix kf = new KidsFix();
	KidsLogoutButton klb = new KidsLogoutButton();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KidsMap window = new KidsMap();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public KidsMap() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1215, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		kf.kidsFix(frame);
		
		URL path = this.getClass().getResource("..\\img\\KidsMap.png");
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_background = new JLabel(new ImageIcon(image.getScaledInstance(1200, 600, Image.SCALE_SMOOTH)));
		lbl_background.setBounds(0, 338, 1199, 601);
		frame.getContentPane().add(lbl_background);
		lbl_background.setBounds(0, 0, 1200, 600);
	}
}