package Main;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ttttttt {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ttttttt window = new ttttttt();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ttttttt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		Image list = new ImageIcon("C:\\Users\\SHMRD\\Pictures\\Screenshots\\main.png").getImage();
		Image image = list;
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(1000, 650, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 984, 611);
		frame.getContentPane().add(lblNewLabel);
	}

}
