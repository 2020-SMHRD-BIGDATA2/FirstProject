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
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JSlider;

public class Join2 {

	JFrame frame;
	Fix test = new Fix();
	private JTextField txt_id;
	private JPasswordField txt_pw;
	private JTextField txt_name;
	private JTextField txt_age;
	private JTextField txt_phoneNumber;

	static ArrayList<VO> list = new ArrayList<VO>();
	DAO dao = new DAO();

	int a = 0;
	private JTextField txt_address;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField_1;
	private JLabel lbl_join2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join2 window = new Join2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Join2() {
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

		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(220, 180, 680, 390);
		frame.getContentPane().add(panel1);

		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(220, 180, 680, 390);
		frame.getContentPane().add(panel3);
		panel3.setLayout(null);
		panel3.setVisible(false);

		JTextPane txt_terms1 = new JTextPane();
		txt_terms1.setText(
				"\uC800\uD76C '\uB3C4\uC11C\uB098\uBB34 \uC232(SOOP)' \uC774\uD558 \uC232\uC740 \uB3D9\uB124 \uC544\uD30C\uD2B8 \uC8FC\uBBFC\uB4E4\uC744 \uB300\uC0C1\uC73C\uB85C \uD558\uB294 \uB3C4\uC11C\uAD00 \uD65C\uC131\uD654 \uC11C\uBE44\uC2A4\uC774\uBA70, \uC758\uD604 \uC544\uD30C\uD2B8 \uC8FC\uBBFC\uBD84\uB4E4\uB9CC \uC774\uC6A9\uD558\uC2E4 \uC218 \uC788\uC2B5\uB2C8\uB2E4. \uB3C4\uC11C \uB4F1\uB85D\uC744 \uD558\uB294 \uC0AC\uC6A9\uC790 \uBD84\uB4E4\uC758 \uCC45 \uC0C1\uD0DC \uBCF4\uC874\uC744 \uC704\uD574 \uBCF4\uC99D\uAE08 50,000\uC6D0\uC744 \uBC1B\uACE0 \uC788\uC73C\uBA70 \uD6FC\uC190\uC2DC \uBCF4\uC99D\uAE08\uC758 \uC77C\uBD80\uB97C \uCC45 \uC18C\uC720\uC790\uC5D0\uAC8C \uB4DC\uB9BD\uB2C8\uB2E4. \uBCF4\uC99D\uAE08\uC774 0\uC6D0\uC774 \uB418\uBA74 \uC11C\uBE44\uC2A4 \uC774\uC6A9\uC774 \uC81C\uD55C\uB420 \uC218 \uC788\uC73C\uBA70, \uCD94\uAC00 \uBE44\uC6A9\uC774 \uBC1C\uC0DD\uD560 \uC218 \uC788\uC2B5\uB2C8\uB2E4. \uC6D0\uD65C\uD55C \uB3C4\uC11C\uAD00 \uC11C\uBE44\uC2A4\uB97C \uC704\uD574 \uC774\uC6A9\uB8CC\uB294 \uAD00\uB9AC\uBE44\uC5D0\uC11C 3,000\uC6D0\uC774 \uBD80\uACFC\uB429\uB2C8\uB2E4.  ");
		txt_terms1.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		txt_terms1.setBackground(new Color(255, 255, 255));
		txt_terms1.setBounds(75, 15, 525, 92);
		panel1.add(txt_terms1);

		JCheckBox ck_agree1 = new JCheckBox("\uC232 \uC774\uC6A9\uC57D\uAD00\uC5D0 \uB300\uD55C \uB3D9\uC758");
		ck_agree1.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		ck_agree1.setBackground(Color.WHITE);
		ck_agree1.setBounds(75, 113, 170, 23);
		panel1.add(ck_agree1);

		JTextPane txt_terms2 = new JTextPane();
		txt_terms2.setText(
				"\uC815\uBCF4\uD1B5\uC2E0\uB9DD\uBC95 \uADDC\uC815\uC5D0 \uB530\uB77C \uC232\uC5D0 \uD68C\uC6D0\uAC00\uC785 \uD558\uC2DC\uB294 \uBD84\uC758 \uAC1C\uC778\uC815\uBCF4 (\uC544\uC774\uB514, \uBE44\uBC00\uBC88\uD638, \uC774\uB984, \uB098\uC774, \uD734\uB300\uD3F0 \uBC88\uD638, \uC8FC\uC18C)\uB97C \uC218\uC9D1\uD558\uACE0 \uC788\uC2B5\uB2C8\uB2E4. \uBAA8\uB4E0 \uC815\uBCF4\uB294 \uD68C\uC6D0\uD0C8\uD1F4 \uC804\uAE4C\uC9C0 \uC720\uD6A8\uD558\uBA70 \uD68C\uC6D0\uD0C8\uD1F4\uB97C \uD558\uBA74 \uBAA8\uB450 \uC0AD\uC81C\uB429\uB2C8\uB2E4.  ");
		txt_terms2.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		txt_terms2.setBounds(75, 151, 525, 60);
		panel1.add(txt_terms2);

		JCheckBox ck_agree2 = new JCheckBox("\uAC1C\uC778\uC815\uBCF4 \uC218\uC9D1\uC5D0 \uB300\uD55C \uB3D9\uC758");
		ck_agree2.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		ck_agree2.setBackground(Color.WHITE);
		ck_agree2.setBounds(75, 217, 185, 23);
		panel1.add(ck_agree2);

		JCheckBox ck_agreeAll = new JCheckBox(
				"\uC774\uC6A9\uC57D\uAD00 \uBC0F \uAC1C\uC778\uC815\uBCF4 \uC218\uC9D1\uC5D0 \uBAA8\uB450 \uB3D9\uC758\uD569\uB2C8\uB2E4.");
		ck_agreeAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		ck_agreeAll.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		ck_agreeAll.setBackground(Color.WHITE);
		ck_agreeAll.setBounds(75, 268, 300, 23);
		panel1.add(ck_agreeAll);

		URL path1 = this.getClass().getResource("..\\img\\joinNextButton.png");
		Image image1 = new ImageIcon(path1).getImage();

		JLabel lbl_nextImg = new JLabel(new ImageIcon(image1.getScaledInstance(90, 40, Image.SCALE_SMOOTH)));
		lbl_nextImg.setBounds(450, 270, 90, 40);
		panel1.add(lbl_nextImg);

		//////////////////////////////////////////////// panel2 시작
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(220, 180, 680, 390);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		panel2.setVisible(false);

		txt_id = new JTextField();
		txt_id.setBackground(new Color(255, 255, 255));
		txt_id.setBounds(241, 51, 200, 25);
		panel2.add(txt_id);
		txt_id.setColumns(10);

		txt_pw = new JPasswordField();
		txt_pw.setBounds(241, 91, 200, 25);
		panel2.add(txt_pw);

		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(241, 131, 200, 25);
		panel2.add(txt_name);

		txt_age = new JTextField();
		txt_age.setColumns(10);
		txt_age.setBounds(241, 191, 200, 25);
		panel2.add(txt_age);

		txt_phoneNumber = new JTextField();
		txt_phoneNumber.setColumns(10);
		txt_phoneNumber.setBounds(241, 231, 200, 25);
		panel2.add(txt_phoneNumber);

		JRadioButton rd_woman = new JRadioButton("\uC5EC\uC131");
		rd_woman.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		rd_woman.setBackground(Color.WHITE);
		rd_woman.setBounds(251, 161, 70, 25);
		panel2.add(rd_woman);

		JRadioButton rd_man = new JRadioButton("\uB0A8\uC131");
		rd_man.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		rd_man.setBackground(Color.WHITE);
		rd_man.setBounds(343, 161, 70, 25);
		panel2.add(rd_man);

		ButtonGroup group = new ButtonGroup();
		group.add(rd_woman);
		group.add(rd_man);

		JCheckBox ck_smsAgree = new JCheckBox("sms \uC218\uC2E0 \uB3D9\uC758");
		ck_smsAgree.setBackground(Color.WHITE);
		ck_smsAgree.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		ck_smsAgree.setBounds(241, 261, 115, 25);
		panel2.add(ck_smsAgree);
///////////////////////////////////////////////////////

		JButton btn_complete = new JButton("");
		btn_complete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String name = txt_name.getText();
				int age = Integer.parseInt(txt_age.getText());
				String add = txt_address.getText();
				String pnum = txt_phoneNumber.getText();

				VO vo = new VO(id, pw, name, age, pnum, add);
				list.add(vo);

				Connection conn = null;
				PreparedStatement psmt = null;

				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");

					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";

					String db_id = "hr";

					String db_pw = "hr";

					conn = DriverManager.getConnection(db_url, db_id, db_pw);

					String SQL = "INSERT INTO MEMBERS VALUES(?,?,?,?,?,?)";

					psmt = conn.prepareStatement(SQL);

					// 중복제거 넣어야 할 부분 !!

					psmt.setString(1, id);
					psmt.setString(2, pw);
					psmt.setString(3, name);
					psmt.setInt(4, age);
					psmt.setString(5, pnum);
					psmt.setString(6, add);

					int cnt = psmt.executeUpdate();

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
				JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다 !", "회원가입", JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();
				Main.main(null);
				Login.main(null);

			}
		});
		btn_complete.setBounds(346, 309, 200, 25);
		panel3.add(btn_complete);
		btn_complete.setBorderPainted(false);
		btn_complete.setContentAreaFilled(false);

		JLabel lbl_completeText = new JLabel("\uAC00\uC785\uC644\uB8CC");
		lbl_completeText.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		lbl_completeText.setBounds(414, 309, 70, 25);
		panel3.add(lbl_completeText);

		URL path2 = this.getClass().getResource("..\\img\\joinCompleteButton.png");
		Image image2 = new ImageIcon(path2).getImage();
		JLabel lbl_complete = new JLabel(new ImageIcon(image2.getScaledInstance(200, 25, Image.SCALE_SMOOTH)));
		lbl_complete.setBounds(346, 309, 200, 25);
		panel3.add(lbl_complete);

		txt_address = new JTextField();
		txt_address.setColumns(10);
		txt_address.setBounds(241, 291, 200, 25);
		panel2.add(txt_address);

		JButton btnNewButton = new JButton("\uC911\uBCF5\uD655\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				boolean result = dao.duplibcateIdCheck(id);
				if (result == true) {
					JOptionPane.showMessageDialog(null, "사용중인 아이디 입니다.", "아이디", JOptionPane.WARNING_MESSAGE);
					txt_id.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "아이디 사용이 가능합니다.", "아이디", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		btnNewButton.setBounds(450, 51, 133, 23);
		panel2.add(btnNewButton);

		URL path3 = this.getClass().getResource("..\\img\\joinNextButton.png");
		Image image3 = new ImageIcon(path3).getImage();

		JLabel lbl_nextImg1 = new JLabel(new ImageIcon(image3.getScaledInstance(90, 40, Image.SCALE_SMOOTH)));
		lbl_nextImg1.setBounds(450, 270, 90, 40);
		panel2.add(lbl_nextImg1);

		JButton btn_next1 = new JButton("");
		btn_next1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				panel3.setVisible(true);

			}
		});
		btn_next1.setContentAreaFilled(false);
		btn_next1.setBorderPainted(false);
		btn_next1.setBounds(450, 270, 90, 40);
		panel2.add(btn_next1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(241, 0, 200, 41);

		URL path_join2 = this.getClass().getResource("..\\img\\join_.png");
		Image image_join2 = new ImageIcon(path_join2).getImage();

		lbl_join2 = new JLabel(new ImageIcon(image_join2.getScaledInstance(200, 41, Image.SCALE_SMOOTH)));
		lbl_join2.setBounds(241, 0, 200, 45);

		panel2.add(lbl_join2);

		JLabel lbl_saying = new JLabel("New label");
		lbl_saying.setBounds(0, 91, 200, 225);

		URL path_saying = this.getClass().getResource("..\\img\\asd.png");
		Image image_saying = new ImageIcon(path_saying).getImage();

		lbl_saying = new JLabel(new ImageIcon(image_saying.getScaledInstance(225, 245, Image.SCALE_SMOOTH)));
		lbl_saying.setBounds(0, 60, 225, 225);

		panel2.add(lbl_saying);

//      JLabel lbl_join2 = new JLabel("");
//      lbl_join2.setBounds(241, 0, 200, 41);
//         
//      URL path_join2 = this.getClass().getResource("..\\img\\join_.png");
//      Image image_join2 = new ImageIcon(path_join2).getImage();
//
//      lbl_join2 = new JLabel(new ImageIcon(image_join2.getScaledInstance(200, 41, Image.SCALE_SMOOTH)));
//      lbl_join2.setBounds(241, 0, 200, 45);
//      panel2.add(lbl_join2);

		JButton btn_next = new JButton("");
		btn_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);

			}
		});
		btn_next.setContentAreaFilled(false);
		btn_next.setBorderPainted(false);
		btn_next.setBounds(450, 270, 90, 40);
		panel1.add(btn_next);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 153));
		panel.setBounds(70, 10, 535, 102);
		panel1.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 204));
		panel_1.setBounds(70, 146, 535, 70);
		panel1.add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("\uBCF4\uC99D\uAE08 \uACB0\uC81C");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		lblNewLabel_1.setBounds(144, 22, 350, 63);
		panel3.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(289, 200, 250, 25);
		panel3.add(textField_1);
		textField_1.setColumns(10);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("SKT");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(290, 239, 60, 23);
		panel3.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("LG U+");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setBounds(360, 239, 60, 23);
		panel3.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("KT");
		rdbtnNewRadioButton_2.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setBounds(430, 239, 60, 23);
		panel3.add(rdbtnNewRadioButton_2);

		textField_2 = new JTextField();
		textField_2.setBounds(289, 274, 116, 25);
		panel3.add(textField_2);
		textField_2.setColumns(10);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(430, 274, 116, 25);
		panel3.add(passwordField_1);

		JLabel lbl_pay = new JLabel("");
		lbl_pay.setBounds(102, 72, 456, 215);

//      URL path_pay = this.getClass().getResource("..\\img\\pay.png");
//      Image image_pay = new ImageIcon(path_pay).getImage();
//
//      lbl_pay = new JLabel(new ImageIcon(image_pay.getScaledInstance(456, 215, Image.SCALE_SMOOTH)));
//      lbl_pay.setBounds(102, 95, 456, 215);
//      panel3.add(lbl_pay);

		URL path = this.getClass().getResource("..\\img\\Map.png");
		Image image = new ImageIcon(path).getImage();

		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);

	}
}