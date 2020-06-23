package Main;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class MyPage {

	private JFrame frame;
	Fix test = new Fix();
	int a = 0;
	private JPanel panel, panel_change;
	private JTextField txt_name;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPage window = new MyPage();
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
	public MyPage() {
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
		
		
		//////////////////////////////////////////////////////////////////

		
		panel_change = new JPanel();
		panel_change.setBounds(257, 175, 633, 395);
		frame.getContentPane().add(panel_change);
		panel_change.setLayout(null);
		panel_change.setVisible(false);

		JLabel lblNewLabel_12 = new JLabel("\uB0B4 \uC815\uBCF4");
		lblNewLabel_12.setBounds(12, 10, 81, 24);
		panel_change.add(lblNewLabel_12);

		JLabel lblNewLabel_22 = new JLabel("\uC774\uB984");
		lblNewLabel_22.setBounds(12, 44, 81, 24);
		panel_change.add(lblNewLabel_22);

		JLabel lblNewLabel_2_12 = new JLabel("PW");
		lblNewLabel_2_12.setBounds(12, 77, 81, 24);
		panel_change.add(lblNewLabel_2_12);

		JLabel lblNewLabel_2_22 = new JLabel("PW_check");
		lblNewLabel_2_22.setBounds(12, 111, 81, 24);
		panel_change.add(lblNewLabel_2_22);
		
		JLabel lblNewLabel_22_1 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_22_1.setBounds(12, 145, 81, 24);
		panel_change.add(lblNewLabel_22_1);
		
		JLabel lblNewLabel_22_2 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_22_2.setBounds(12, 186, 81, 24);
		panel_change.add(lblNewLabel_22_2);
		
		txt_name = new JTextField();
		txt_name.setBounds(76, 44, 135, 24);
		panel_change.add(txt_name);
		txt_name.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(76, 78, 135, 24);
		panel_change.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(76, 111, 135, 24);
		panel_change.add(passwordField_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 152, 135, 24);
		textField_1.setColumns(10);
		panel_change.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 220, 135, 24);
		textField_2.setColumns(10);
		panel_change.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 188, 135, 24);
		textField_3.setColumns(10);
		panel_change.add(textField_3);
		
				JLabel lbl_pNum = new JLabel("\uC774\uB984");
				lbl_pNum.setBounds(76, 111, 135, 24);
				panel_change.add(lbl_pNum);
				
						JLabel lbl_where = new JLabel("\uC774\uB984");
						lbl_where.setBounds(76, 152, 135, 24);
						panel_change.add(lbl_where);
//////////////////////////////////////////////////////////////////////////////////
			// 여기에 conn 해서 정보 수정하기 위한 코드 들어가야 함
///////////////////////////////////////////////////////////////////////////////////
						JButton btn_commit = new JButton("\uBCC0\uACBD \uC644\uB8CC");
						btn_commit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								a++;
								if (a % 2 == 0) {
									panel.setVisible(true); // panel의 시각화 유무를 결정해주는 기능
									panel_change.setVisible(false);
								} else {
									panel.setVisible(false);
									panel_change.setVisible(true);
								}
								
								
							}
						});
						btn_commit.setBounds(483, 344, 138, 41);
						panel_change.add(btn_commit);
		
		
		/////////////////////////////////////////

		panel = new JPanel();
		panel.setBounds(257, 175, 633, 395);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("\uB0B4 \uC815\uBCF4");
		lblNewLabel_1.setBounds(12, 10, 81, 24);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("\uB0B4 \uCC45");
		lblNewLabel_1_1.setBounds(12, 186, 81, 24);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("\uB0B4 \uCC45");
		lblNewLabel_1_2.setBounds(304, 15, 81, 24);
		panel.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("\uB0B4 \uCC45");
		lblNewLabel_1_3.setBounds(304, 186, 81, 24);
		panel.add(lblNewLabel_1_3);

		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984");
		lblNewLabel_2.setBounds(12, 44, 81, 24);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setBounds(12, 77, 81, 24);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_2_2.setBounds(12, 111, 81, 24);
		panel.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2_3.setBounds(12, 145, 81, 24);
		panel.add(lblNewLabel_2_3);

		JLabel lbl_name = new JLabel("\uC774\uB984\uC758 \uC8FC\uC18C\uAC12 \uC785\uB825");
		lbl_name.setBounds(76, 44, 135, 24);
		panel.add(lbl_name);

		JLabel lbl_ID = new JLabel("id\uC8FC\uC18C\uAC12");
		lbl_ID.setBounds(76, 78, 135, 24);
		panel.add(lbl_ID);
		
		JLabel lbl_ponNum = new JLabel("\uC5F0\uB77D\uCC98 \uC8FC\uC18C\uAC12");
		lbl_ponNum.setBounds(76, 111, 135, 24);
		panel.add(lbl_ponNum);
		
		JLabel lbl_where_ = new JLabel("\uC8FC\uC18C\uC758 \uC8FC\uC18C\uAC12");
		lbl_where_.setBounds(76, 145, 135, 24);
		panel.add(lbl_where_);
		
				JButton btnNewButton = new JButton("\uBCC0\uACBD\uD558\uAE30");
				btnNewButton.setBounds(76, 11, 97, 23);
				panel.add(btnNewButton);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						a++;
						if (a % 2 == 0) {
							panel.setVisible(true); // panel의 시각화 유무를 결정해주는 기능
							panel_change.setVisible(false);
						} else {
							panel.setVisible(false);
							panel_change.setVisible(true);
						}
					}
				});

		

		

		Image list1 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\Project\\Map.png").getImage();
		Image image1 = list1;

		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);

	}
}
