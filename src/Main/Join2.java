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

	private JFrame frame;
	Fix test = new Fix();
	private JTextField txt_id;
	private JPasswordField passwordField;
	private JTextField txt_name;
	private JTextField txt_age;
	private JTextField txt_phoneNumber;

	int a = 0;
	private JTextField textField;

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

		JTextPane txt_terms1 = new JTextPane();
		txt_terms1.setText(
				"\uC800\uD76C '\uB3C4\uC11C\uB098\uBB34 \uC232(SOOP)' \uC774\uD558 \uC232\uC740 \uB3D9\uB124 \uC544\uD30C\uD2B8 \uC8FC\uBBFC\uB4E4\uC744 \uB300\uC0C1\uC73C\uB85C \uD558\uB294 \uB3C4\uC11C\uAD00 \uD65C\uC131\uD654 \uC11C\uBE44\uC2A4\uC774\uBA70, \uC758\uD604 \uC544\uD30C\uD2B8 \uC8FC\uBBFC\uBD84\uB4E4\uB9CC \uC774\uC6A9\uD558\uC2E4 \uC218 \uC788\uC2B5\uB2C8\uB2E4. \uB3C4\uC11C \uB4F1\uB85D\uC744 \uD558\uB294 \uC0AC\uC6A9\uC790 \uBD84\uB4E4\uC758 \uCC45 \uC0C1\uD0DC \uBCF4\uC874\uC744 \uC704\uD574 \uBCF4\uC99D\uAE08 50,000\uC6D0\uC744 \uBC1B\uACE0 \uC788\uC73C\uBA70 \uD6FC\uC190\uC2DC \uBCF4\uC99D\uAE08\uC758 \uC77C\uBD80\uB97C \uCC45 \uC18C\uC720\uC790\uC5D0\uAC8C \uB4DC\uB9BD\uB2C8\uB2E4. \uBCF4\uC99D\uAE08\uC774 0\uC6D0\uC774 \uB418\uBA74 \uC11C\uBE44\uC2A4 \uC774\uC6A9\uC774 \uC81C\uD55C\uB420 \uC218 \uC788\uC73C\uBA70, \uCD94\uAC00 \uBE44\uC6A9\uC774 \uBC1C\uC0DD\uD560 \uC218 \uC788\uC2B5\uB2C8\uB2E4. \uC6D0\uD65C\uD55C \uB3C4\uC11C\uAD00 \uC11C\uBE44\uC2A4\uB97C \uC704\uD574 \uC774\uC6A9\uB8CC\uB294 3,000\uC6D0\uC774 \uBD80\uACFC\uB429\uB2C8\uB2E4.  ");
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
		txt_id.setBounds(129, 35, 200, 25);
		panel2.add(txt_id);
		txt_id.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(129, 94, 200, 25);
		panel2.add(passwordField);

		JLabel lbl_id = new JLabel("\uC544\uC774\uB514");
		lbl_id.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		lbl_id.setBounds(142, 10, 137, 25);
		panel2.add(lbl_id);

		JLabel lbl_pw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lbl_pw.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		lbl_pw.setBounds(142, 69, 137, 25);
		panel2.add(lbl_pw);

		JLabel lbl_name = new JLabel("\uC774\uB984");
		lbl_name.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		lbl_name.setBounds(142, 129, 137, 25);
		panel2.add(lbl_name);

		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(129, 154, 200, 25);
		panel2.add(txt_name);

		JLabel lbl_age = new JLabel("\uB098\uC774");
		lbl_age.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		lbl_age.setBounds(142, 216, 137, 25);
		panel2.add(lbl_age);

		txt_age = new JTextField();
		txt_age.setColumns(10);
		txt_age.setBounds(129, 241, 200, 25);
		panel2.add(txt_age);

		JLabel lbl_phoneNumber = new JLabel("\uC804\uD654\uBC88\uD638");
		lbl_phoneNumber.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		lbl_phoneNumber.setBounds(383, 10, 137, 25);
		panel2.add(lbl_phoneNumber);

		txt_phoneNumber = new JTextField();
		txt_phoneNumber.setColumns(10);
		txt_phoneNumber.setBounds(383, 35, 200, 25);
		panel2.add(txt_phoneNumber);

		JLabel lbl_address = new JLabel("\uC8FC\uC18C");
		lbl_address.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		lbl_address.setBounds(383, 93, 137, 25);
		panel2.add(lbl_address);

		JRadioButton rd_woman = new JRadioButton("\uC5EC\uC131");
		rd_woman.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		rd_woman.setBackground(Color.WHITE);
		rd_woman.setBounds(139, 185, 70, 25);
		panel2.add(rd_woman);

		JRadioButton rd_man = new JRadioButton("\uB0A8\uC131");
		rd_man.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		rd_man.setBackground(Color.WHITE);
		rd_man.setBounds(231, 185, 70, 25);
		panel2.add(rd_man);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rd_woman);
		group.add(rd_man);

		JCheckBox ck_smsAgree = new JCheckBox("sms \uC218\uC2E0 \uB3D9\uC758");
		ck_smsAgree.setBackground(Color.WHITE);
		ck_smsAgree.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		ck_smsAgree.setBounds(383, 66, 115, 25);
		panel2.add(ck_smsAgree);


		JButton btn_complete = new JButton("");
		btn_complete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다 !", "회원가입", JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();
				Main.main(null);
				Login.main(null);
			}
		});
		btn_complete.setBounds(383, 241, 200, 25);
		panel2.add(btn_complete);
		btn_complete.setBorderPainted(false);
		btn_complete.setContentAreaFilled(false);
		
		JLabel lbl_completeText = new JLabel("\uAC00\uC785\uC644\uB8CC");
		lbl_completeText.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		lbl_completeText.setBounds(452, 240, 70, 25);
		panel2.add(lbl_completeText);
		
		URL path2 = this.getClass().getResource("..\\img\\joinCompleteButton.png");
		Image image2 = new ImageIcon(path2).getImage();
		
		JLabel lbl_complete = new JLabel(new ImageIcon(image2.getScaledInstance(200, 25, Image.SCALE_SMOOTH)));
		lbl_complete.setBounds(383, 241, 200, 25);
		panel2.add(lbl_complete);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(383, 117, 200, 25);
		panel2.add(textField);

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

		URL path = this.getClass().getResource("..\\img\\Map.png");
		Image image = new ImageIcon(path).getImage();

		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);

	}
}