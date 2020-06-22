package Main;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class Main {

	private JFrame frame;
	private JTextField txt_find;
	int cnt = 0;

	Fix test = new Fix();
	Login log = new Login();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
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

		txt_find = new JTextField();
		txt_find.setHorizontalAlignment(SwingConstants.CENTER);
		txt_find.setBounds(275, 42, 540, 45);
		frame.getContentPane().add(txt_find);
		txt_find.setColumns(10);
		txt_find.setBackground(null);

		Image[] list = new Image[3];
		list[0] = new ImageIcon("C:\\Users\\SHMRD\\Pictures\\Screenshots\\121.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SHMRD\\Pictures\\Screenshots\\1.png").getImage();
		list[2] = new ImageIcon("C:\\Users\\SHMRD\\Pictures\\Screenshots\\2.png").getImage();

		Image image = list[cnt];

		JLabel lbl_img1 = new JLabel(new ImageIcon(image.getScaledInstance(460, 341, Image.SCALE_SMOOTH)));
		lbl_img1.setBackground(Color.WHITE);
		lbl_img1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_img1.setBounds(260, 184, 600, 331);
		frame.getContentPane().add(lbl_img1);

		
		test.sup_mix(frame);
		

		JButton btn_left = new JButton("");
		btn_left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cnt > 2) {
					cnt = 0;
				}

				// label에 이미지를 재설정 -> 매개변수로 Icon -> 이미지를 세팅할거니까 new ImageIcon()
				lbl_img1.setIcon(new ImageIcon(list[cnt]));
				cnt++;

				if (cnt > 2) {
					cnt = 0;
				}

			}
		});
		btn_left.setBounds(260, 184, 50, 331);
		frame.getContentPane().add(btn_left);
		btn_left.setBorderPainted(false);
		btn_left.setContentAreaFilled(false);

		JButton btn_right = new JButton("");
		btn_right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cnt < 0) {
					cnt = 2;
				}

				lbl_img1.setIcon(new ImageIcon(list[cnt]));
				cnt--;

				if (cnt < 0) {
					cnt = 2;
				}

			}
		});
		btn_right.setBounds(815, 185, 50, 331);
		frame.getContentPane().add(btn_right);
		btn_right.setBorderPainted(false);
		btn_right.setContentAreaFilled(false);

		Image list1 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\Project\\Main.png").getImage();
		Image image1 = list1;

		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);

	}
}
