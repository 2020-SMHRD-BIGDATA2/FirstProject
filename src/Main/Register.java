package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import 데이터.bookVO;
import 데이터.bookDAO;

public class Register {

	private JFrame frame;
	Fix test = new Fix();
	private JTextField txt_bname;
	private JTextField txt_author;
	private JTextField txt_year;
	private JTextField txt_publisher;
	private String gre = null;
	private String bookid = null;
	private int n = 1;
	private int cnt = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	public Register() {
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
		JPanel panel = new JPanel();
		panel.setBounds(231, 10, 654, 581);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_bname = new JTextField();
		txt_bname.setBounds(214, 171, 222, 30);
		panel.add(txt_bname);
		txt_bname.setColumns(10);

		txt_author = new JTextField();
		txt_author.setBounds(214, 211, 222, 30);
		panel.add(txt_author);
		txt_author.setColumns(10);

		txt_year = new JTextField();
		txt_year.setColumns(10);
		txt_year.setBounds(214, 291, 222, 30);
		panel.add(txt_year);

		JLabel lblNewLabel_1 = new JLabel("\uCC45\uC81C\uBAA9");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(145, 178, 57, 15);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("\uC800\uC790");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(145, 218, 57, 15);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("\uCD9C\uD310\uC0AC");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setBounds(145, 258, 57, 15);
		panel.add(lblNewLabel_1_2);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				gre = (String) comboBox.getSelectedItem();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "\uBC94\uC8C4, \uC2A4\uB9B4\uB7EC", "\uD310\uD0C0\uC9C0", "\uB85C\uB9E8\uC2A4", "19" }));
		comboBox.setBounds(214, 354, 222, 21);
		panel.add(comboBox);

		JLabel lblNewLabel_2 = new JLabel("\uC7A5\uB974\uC120\uD0DD");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(145, 357, 57, 15);
		panel.add(lblNewLabel_2);

		JButton btn_register = new JButton("\uB4F1\uB85D\uD558\uAE30");
		btn_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (gre.equals("범죄,스릴러")) {
					String book_gre = "BC";
					bookid = bookid + n;
					n++;
				} else if (gre.equals("판타지")) {
					String book_gre = "BS";

					bookid = book_gre + n;
					n++;
				} else if (gre.equals("로맨스")) {
					String book_gre = "CE";

					bookid = book_gre + n;
					n++;
				} else if (gre.equals("19")) {
					String book_gre = "CS";

					bookid = book_gre + n;
					n++;
				}
				String bname = txt_bname.getText();
				String author = txt_author.getText();
				String publisher = txt_publisher.getText();
				int year = Integer.parseInt(txt_year.getText());

				Connection conn = null;
				PreparedStatement psmt = null;

				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");

					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";

					String db_id = "hr";

					String db_pw = "hr";

					conn = DriverManager.getConnection(db_url, db_id, db_pw);

					String SQL = "INSERT INTO BOOKS VALUES(?,?,?,?,?,?)";

					psmt = conn.prepareStatement(SQL);

					// 중복제거 넣어야 할 부분 !!

					psmt.setString(1, bookid);
					psmt.setString(2, bname);
					psmt.setString(3, author);
					psmt.setString(4, publisher);
					psmt.setString(5, "1");
					psmt.setInt(6, year);

					cnt = psmt.executeUpdate();

				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();

				} finally {

					try {
						if (psmt != null) {
							psmt.close();
						}
						if (conn != null) {
							conn.close();
						}
					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				}
				boolean check = false;

				if (cnt > 0) {
					check = true;
				}

				if (check) {

					JOptionPane.showMessageDialog(null, "나뭇잎 하나 완성!", "도서등록", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "나뭇잎이 떨어졌어요!ㅠㅠ", "도서등록실패", JOptionPane.WARNING_MESSAGE);
				}

			}
		});
		btn_register.setBounds(217, 405, 229, 47);
		panel.add(btn_register);

		txt_publisher = new JTextField();
		txt_publisher.setColumns(10);
		txt_publisher.setBounds(214, 251, 222, 30);
		panel.add(txt_publisher);

		JLabel lblNewLabel_1_2_1 = new JLabel("\uBC1C\uD589\uC5F0\uB3C4");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_1.setBounds(145, 298, 57, 15);
		panel.add(lblNewLabel_1_2_1);

		URL path = this.getClass().getResource("..\\img\\Register.png");
		Image image = new ImageIcon(path).getImage();

		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);

	}
}