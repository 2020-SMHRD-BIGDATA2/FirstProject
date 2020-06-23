package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class Map {

	private JFrame frame;
	Fix test = new Fix();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Map window = new Map();
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
	public Map() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 1215, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		test.sup_mix(frame);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(297, 151, 511, 274);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		URL path1 = this.getClass().getResource("..\\img\\Map11.JPG");
		Image image1 = new ImageIcon(path1).getImage();
		
		JLabel lbl_map11 = new JLabel(new ImageIcon(image1.getScaledInstance(511, 274, Image.SCALE_SMOOTH)));
		lbl_map11.setBounds(0, 0, 511, 274);
		panel.add(lbl_map11);
		
		URL path = this.getClass().getResource("..\\img\\Map.png");
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);

		JLabel lbl_map = new JLabel(new ImageIcon(image.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lbl_map.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lbl_map);
		
		
		
		


	}
}