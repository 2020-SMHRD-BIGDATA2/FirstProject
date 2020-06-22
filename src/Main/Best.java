package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
		frame.getContentPane().setLayout(null);

		test.sup_mix(frame);
		
		Image list2 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\best_1.png").getImage();
		Image image2 = list2;
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(image2.getScaledInstance(140, 180, Image.SCALE_SMOOTH)));
		lblNewLabel_1.setBounds(266, 168, 127, 176);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		Image list3 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\best_2.png").getImage();
		Image image3 = list3;
		JLabel lblNewLabel_1_1 = new JLabel(new ImageIcon(image3.getScaledInstance(140, 180, Image.SCALE_SMOOTH)));
		lblNewLabel_1_1.setBounds(562, 168, 127, 176);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		Image list4 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\best_3.png").getImage();
		Image image4 = list4;		
		
		JLabel lblNewLabel_1_2 = new JLabel(new ImageIcon(image4.getScaledInstance(140, 180, Image.SCALE_SMOOTH)));
		lblNewLabel_1_2.setBounds(266, 394, 127, 176);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		
		Image list5 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\best_4.png").getImage();
		Image image5 = list5;
		JLabel lblNewLabel_1_3 = new JLabel(new ImageIcon(image5.getScaledInstance(140, 180, Image.SCALE_SMOOTH)));
		lblNewLabel_1_3.setBounds(562, 394, 127, 176);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		Image list1 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\Project\\M_best.png").getImage();
		Image image1 = list1;

		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);

	}
}