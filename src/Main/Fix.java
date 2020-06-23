package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Fix {

	JTextField txt_find;

	public void sup_mix(JFrame frame) {
		String str = "·Î±×¾Æ¿ô";

		JButton btn_login = new JButton("·Î±×ÀÎ");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Login.main(null);
				
				btn_login.setText(str);

			}
		});
		btn_login.setBounds(903, 45, 60, 30);
		frame.getContentPane().add(btn_login);  //Ä«µå·¹ÀÌ ¾Æ¿ô °°Àº°Å »ðÀÔ
		btn_login.setBorderPainted(false); // º¸´õ ¾Èº¸ÀÌ°Ô
		btn_login.setContentAreaFilled(false); // ÄÁÅÙ ¾Æ¸®¾Æ ¾Æº¸ÀÌ°Ô

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

		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
<<<<<<< HEAD
				Join2.main(null);
=======
				Join.main(null);
>>>>>>> branch 'master' of https://github.com/euihyeon0329/FirstProject.git

			}
		});
		btn_join.setBounds(980, 45, 60, 31);
		frame.getContentPane().add(btn_join);
		btn_join.setBorderPainted(false);
		btn_join.setContentAreaFilled(false);

		JButton btn_page = new JButton("\uC11C\uC7AC");
		btn_page.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				MyPage.main(null);
			}
		});
		btn_page.setBounds(1054, 45, 57, 30);
		frame.getContentPane().add(btn_page);
		btn_page.setBorderPainted(false);
		btn_page.setContentAreaFilled(false);

		JButton btn_library = new JButton("\uBCF4\uC790\uAE30");
		btn_library.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Library.main(null);
			}
		});
		btn_library.setBounds(1130, 45, 57, 31);
		frame.getContentPane().add(btn_library);
		btn_library.setBorderPainted(false);
		btn_library.setContentAreaFilled(false);

		JButton btn_register = new JButton("µµ¼­ µî·Ï");
		btn_register.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Register.main(null);
			}
		});
		btn_register.setBounds(88, 360, 100, 40);
		frame.getContentPane().add(btn_register);
		btn_register.setBorderPainted(false);
		btn_register.setContentAreaFilled(false);

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
				KidsMain.main(null);
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
				
				/// °Ë»öÃ¢ ÀÔ·Â¹öÆ°
				
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

		JButton btn_Gallery = new JButton("°Ô½ÃÆÇ");
		btn_Gallery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Gallery.main(null);
			}
		});
		btn_Gallery.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_Gallery.setBounds(88, 420, 100, 40);
		frame.getContentPane().add(btn_Gallery);
		btn_Gallery.setBorderPainted(false);
		btn_Gallery.setContentAreaFilled(false);

		JButton btn_avg = new JButton("Åë°è");
		btn_avg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Avg.main(null);
			}
		});
		btn_avg.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_avg.setContentAreaFilled(false);
		btn_avg.setBorderPainted(false);
		btn_avg.setBounds(88, 475, 100, 40);
		frame.getContentPane().add(btn_avg);

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
	}

}
