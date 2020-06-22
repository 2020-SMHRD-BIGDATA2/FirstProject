package Main;

import java.awt.EventQueue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Join {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_name;
	private JTextField txt_age;
	private JPasswordField txt_pw;

	static ArrayList<VO> list = new ArrayList<VO>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join window = new Join();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Join() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txt_id = new JTextField();
		txt_id.setBounds(388, 100, 200, 37);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);

		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(388, 200, 200, 37);
		frame.getContentPane().add(txt_name);

		txt_age = new JTextField();
		txt_age.setColumns(10);
		txt_age.setBounds(388, 250, 200, 37);
		frame.getContentPane().add(txt_age);

		JLabel lbl_join = new JLabel("\uD68C\uC6D0 \uAC00\uC785");
		lbl_join.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_join.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lbl_join.setBounds(352, 10, 200, 37);
		frame.getContentPane().add(lbl_join);

		JLabel lbl_id = new JLabel("\uC544\uC774\uB514");
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lbl_id.setBounds(316, 111, 60, 15);
		frame.getContentPane().add(lbl_id);

		JLabel lbl_pw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pw.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lbl_pw.setBounds(316, 161, 60, 15);
		frame.getContentPane().add(lbl_pw);

		JLabel lbl_name = new JLabel("\uC774\uB984");
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lbl_name.setBounds(316, 211, 60, 15);
		frame.getContentPane().add(lbl_name);

		JLabel lbl_age = new JLabel("\uB098\uC774");
		lbl_age.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_age.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lbl_age.setBounds(316, 261, 60, 15);
		frame.getContentPane().add(lbl_age);

		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String name = txt_name.getText();
				int age = Integer.parseInt(txt_age.getText());

				VO vo = new VO(id, pw, name, age);
				list.add(vo);

				Connection conn = null;
				PreparedStatement psmt = null;

				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");

					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";

					String db_id = "hr";

					String db_pw = "hr";


					conn = DriverManager.getConnection(db_url, db_id, db_pw);

					String SQL = "INSERT INTO info VALUES(?,?,?,?)";

					psmt = conn.prepareStatement(SQL);
					
					
					// Áßº¹Á¦°Å ³Ö¾î¾ß ÇÒ ºÎºÐ !!

					psmt.setString(1, id);
					psmt.setString(2, pw);
					psmt.setString(3, name);
					psmt.setInt(4, age);
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
				
				
				
				frame.dispose();
				Login.main(null);

			}
		});
		btn_join.setBounds(388, 297, 200, 35);
		frame.getContentPane().add(btn_join);

		txt_pw = new JPasswordField();
		txt_pw.setBounds(388, 150, 200, 37);
		frame.getContentPane().add(txt_pw);
		
		JButton btn_back = new JButton("<");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Main.main(null);
				
			}
		});
		btn_back.setBounds(899, 12, 41, 37);
		frame.getContentPane().add(btn_back);
	}
}
