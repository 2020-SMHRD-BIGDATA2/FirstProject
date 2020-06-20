package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;
	DAO dao = new DAO();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txt_id = new JTextField();
		txt_id.setBounds(88, 169, 233, 40);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);

		txt_pw = new JPasswordField();
		txt_pw.setBounds(88, 233, 233, 40);
		frame.getContentPane().add(txt_pw);

		JButton btn_login = new JButton("");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String pw = txt_pw.getText();

				Connection conn = null;
				PreparedStatement psmt = null;
				ResultSet rs = null;

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");

					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
					String db_id = "hr";
					String db_pw = "hr";

					conn = DriverManager.getConnection(db_url, db_id, db_pw);

					String sql = "SELECT * FROM info WHERE ID = ? AND PW = ?";

					psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					psmt.setString(2, pw);
					rs = psmt.executeQuery();

					// if 문 시작해서 db안의 데이터의 id pw가 일치 할 시 실행
					frame.dispose();
					// Main.main(null);

//					String id = txt_id.getText();
//					String pw = txt_pw.getText();

					String id1 = txt_id.getText();
					String pw1 = txt_pw.getText();
					VO vo = new VO(id1, pw1);
					String name = dao.login(vo);

					if (name != null) {
						JOptionPane.showMessageDialog(null, name + "님 환영합니다!");

					} else {
						JOptionPane.showMessageDialog(null, "로그인에 실패하였습니다!");

					}

//		            boolean check = false;
//		            int index = 0;
//		            
//		            for (int i = 0; i < Join.list.size(); i++) {
//		               if (Join.list.get(i).getId().equals(id) && Join.list.get(i).getPw().equals(pw)) {
//		                  // System.out.println("로그인 성공 " + Join.list.get(i).getName()+"님 환영합니다.");
//		                  check = true;
//		                  index = i;
//		               }
//		            }

					//

				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					try {
						if (rs != null) {
							rs.close();
						}
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

			}
		});
		btn_login.setBorderPainted(false);
		btn_login.setContentAreaFilled(false);

		JButton btn_IdPwfind = new JButton("");
		btn_IdPwfind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_IdPwfind.setBounds(171, 283, 163, 23);
		frame.getContentPane().add(btn_IdPwfind);
		btn_IdPwfind.setBorderPainted(false);
		btn_IdPwfind.setContentAreaFilled(false);

		btn_login.setBounds(100, 340, 233, 34);
		frame.getContentPane().add(btn_login);
		JButton btn_join = new JButton("");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Join.main(null);

			}
		});
		btn_join.setBounds(237, 307, 96, 23);
		frame.getContentPane().add(btn_join);
		btn_join.setBorderPainted(false);
		btn_join.setContentAreaFilled(false);

		Image list1 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\JAVA\\Project\\src\\Img\\Login_main.png").getImage();
		Image image1 = list1;

		JLabel lbl_img = new JLabel(new ImageIcon(image1.getScaledInstance(400, 540, Image.SCALE_SMOOTH)));
		lbl_img.setBounds(0, 0, 384, 540);
		frame.getContentPane().add(lbl_img);

	}
}
