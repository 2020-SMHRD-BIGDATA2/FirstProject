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
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Best {

	private JFrame frame;
	Fix test = new Fix();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Best window = new Best();
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
	public Best() {
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
		frame.getContentPane().setLayout(null);
		
		Image list2 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\best_1.png").getImage();
		Image image2 = list2;
		JLabel lbl_img1 = new JLabel(new ImageIcon(image2.getScaledInstance(140, 180, Image.SCALE_SMOOTH)));
		lbl_img1.setBounds(244, 122, 127, 176);
		frame.getContentPane().add(lbl_img1);
		
		
		Image list3 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\best_2.png").getImage();
		Image image3 = list3;
		JLabel lbl_img2 = new JLabel(new ImageIcon(image3.getScaledInstance(140, 180, Image.SCALE_SMOOTH)));
		lbl_img2.setBounds(403, 122, 127, 176);
		frame.getContentPane().add(lbl_img2);
		
		Image list4 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\best_3.png").getImage();
		Image image4 = list4;
		
		JLabel lbl_img3 = new JLabel(new ImageIcon(image4.getScaledInstance(140, 180, Image.SCALE_SMOOTH)));
		lbl_img3.setBounds(562, 122, 127, 176);
		frame.getContentPane().add(lbl_img3);
		
		
		Image list5 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\best_4.png").getImage();
		Image image5 = list5;
		JLabel lbl_img4 = new JLabel(new ImageIcon(image5.getScaledInstance(140, 180, Image.SCALE_SMOOTH)));
		lbl_img4.setBounds(722, 122, 127, 176);
		frame.getContentPane().add(lbl_img4);
		
		URL path = this.getClass().getResource("..\\img\\Best.png");
		Image image = new ImageIcon(path).getImage();

		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);
		

		
	}
}