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

		Image[] list = new Image[3];
		list[0] = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\ba.jpg").getImage();
		list[1] = new ImageIcon("C:\\Users\\SHMRD\\Pictures\\Screenshots\\1.png").getImage();
		list[2] = new ImageIcon("C:\\Users\\SHMRD\\Pictures\\Screenshots\\2.png").getImage();

		Image image = list[cnt];

		JLabel lbl_img1 = new JLabel(new ImageIcon(image.getScaledInstance(460, 341, Image.SCALE_SMOOTH)));
		lbl_img1.setBackground(Color.WHITE);
		lbl_img1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_img1.setBounds(260, 184, 600, 331);
		frame.getContentPane().add(lbl_img1);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Login.main(null);

			}
		});
		btn_login.setBounds(903, 45, 60, 30);
		frame.getContentPane().add(btn_login);
		btn_login.setBorderPainted(false);
		btn_login.setContentAreaFilled(false);

		JButton btn_book = new JButton("\uB3C4\uC11C");
		btn_book.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Book.main(null);
			}
		});
		btn_book.setBounds(88, 184, 100, 40);
		frame.getContentPane().add(btn_book);
		btn_book.setBorderPainted(false);
		btn_book.setContentAreaFilled(false);

		JButton btn_left = new JButton("");
		btn_left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cnt > 2) {
					cnt = 0;
				}

				// label¿¡ ÀÌ¹ÌÁö¸¦ Àç¼³Á¤ -> ¸Å°³º¯¼ö·Î Icon -> ÀÌ¹ÌÁö¸¦ ¼¼ÆÃÇÒ°Å´Ï±î new ImageIcon()
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

		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// frame.dispose();
				Join.main(null);

			}
		});
		btn_join.setBounds(980, 45, 60, 31);
		frame.getContentPane().add(btn_join);
		btn_join.setBorderPainted(false);
		btn_join.setContentAreaFilled(false);

		JButton btn_library = new JButton("\uC11C\uC7AC");
		btn_library.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Library.main(null);
			}
		});
		btn_library.setBounds(1054, 45, 57, 30);
		frame.getContentPane().add(btn_library);
		btn_library.setBorderPainted(false);
		btn_library.setContentAreaFilled(false);

		JButton btn_mylist = new JButton("\uBCF4\uC790\uAE30");
		btn_mylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Library.main(null);
			}
		});
		btn_mylist.setBounds(1130, 45, 57, 31);
		frame.getContentPane().add(btn_mylist);
		btn_mylist.setBorderPainted(false);
		btn_mylist.setContentAreaFilled(false);

		JButton btn_gallery = new JButton("\uAC8C\uC2DC\uD310");
		btn_gallery.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_gallery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Gallery.main(null);
			}
		});
		btn_gallery.setBounds(88, 360, 100, 40);
		frame.getContentPane().add(btn_gallery);
		btn_gallery.setBorderPainted(false);
		btn_gallery.setContentAreaFilled(false);

		JButton btn_best = new JButton("\uBCA0\uC2A4\uD2B8");
		btn_best.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Best.main(null);
			}
		});
		btn_best.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_best.setBounds(88, 243, 100, 40);
		frame.getContentPane().add(btn_best);
		btn_best.setBorderPainted(false);
		btn_best.setContentAreaFilled(false);

		JButton btn_kid = new JButton("\uC720\uC544");
		btn_kid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Avg.main(null);
			}
		});
		btn_kid.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_kid.setBounds(88, 303, 100, 40);
		frame.getContentPane().add(btn_kid);
		btn_kid.setBorderPainted(false);
		btn_kid.setContentAreaFilled(false);

		JButton btn_find = new JButton("");
		btn_find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_find.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btn_find.setBounds(815, 45, 40, 40);
		frame.getContentPane().add(btn_find);
		btn_find.setBorderPainted(false);
		btn_find.setContentAreaFilled(false);

		JButton btn_home = new JButton("");
		btn_home.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Main.main(null);
				frame.dispose();
			}
		});
		btn_home.setBounds(88, 12, 100, 145);
		frame.getContentPane().add(btn_home);
		btn_home.setBorderPainted(false);
		btn_home.setContentAreaFilled(false);

		JButton btn_avg = new JButton("\uD1B5\uACC4");
		btn_avg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Avg.main(null);
			}
		});
		btn_avg.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_avg.setBounds(88, 420, 100, 40);
		frame.getContentPane().add(btn_avg);
		btn_avg.setBorderPainted(false);
		btn_avg.setContentAreaFilled(false);

		JButton btn_info = new JButton("µµ¼­ µî·Ï");
		btn_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Info.main(null);
			}
		});
		btn_info.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_info.setContentAreaFilled(false);
		btn_info.setBorderPainted(false);
		btn_info.setBounds(88, 475, 100, 40);
		frame.getContentPane().add(btn_info);

		JButton btn_map = new JButton("");
		btn_map.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Map.main(null);

			}
		});
		btn_map.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_map.setContentAreaFilled(false);
		btn_map.setBorderPainted(false);
		btn_map.setBounds(1011, 451, 147, 150);
		frame.getContentPane().add(btn_map);

		Image list1 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\Fix_main.png").getImage();
		Image image1 = list1;

		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);

	}
}
