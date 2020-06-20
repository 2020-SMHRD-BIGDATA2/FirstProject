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

public class Book {

	private JFrame frame;
	Fix test = new Fix();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book window = new Book();
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
	public Book() {
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
		

		
		JButton btnNewButton = new JButton("10\uB300");
		btnNewButton.setBounds(263, 235, 171, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("20\uB300");
		btnNewButton_1.setBounds(458, 235, 171, 61);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("60~");
		btnNewButton_2.setBounds(655, 379, 171, 61);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("30\uB300");
		btnNewButton_3.setBounds(655, 235, 171, 61);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("40\uB300");
		btnNewButton_4.setBounds(263, 379, 171, 61);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("50\uB300");
		btnNewButton_5.setBounds(458, 379, 171, 61);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("\uB3C4\uC11C");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(263, 145, 171, 49);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		Image list1 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\Fix_main.png").getImage();
		Image image1 = list1;

		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);
		


	}
}