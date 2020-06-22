package Main;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KidsMain {

	private JFrame frame;
	KidsFix kf = new KidsFix();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KidsMain window = new KidsMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public KidsMain() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1215, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		kf.kidsFix(frame);
		JButton btn_book = new JButton("\uB3C4\uC11C");
		btn_book.setBounds(96, 191, 97, 41);
		frame.getContentPane().add(btn_book);
		btn_book.setBorderPainted(false);
		btn_book.setContentAreaFilled(false);
		btn_book.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				KidsBook.main(null);
			}
		});

		JButton btn_best = new JButton("베스트");
		btn_best.setBounds(96, 245, 97, 41);
		frame.getContentPane().add(btn_best);
		btn_best.setBorderPainted(false);
		btn_best.setContentAreaFilled(false);
		btn_best.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				KidsBest.main(null);
			}
		});

		JButton btn_allAge = new JButton("전연령");
		btn_allAge.setBounds(96, 303, 97, 41);
		btn_allAge.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				Main.main(null);
			}
		});
		frame.getContentPane().add(btn_allAge);
		btn_allAge.setBorderPainted(false);
		btn_allAge.setContentAreaFilled(false);
		
			btn_allAge.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
					Main.main(null);
				}
			});

		JButton btn_register = new JButton("도서등록");
		btn_register.setBounds(96, 355, 97, 41);
		frame.getContentPane().add(btn_register);
		btn_register.setBorderPainted(false);
		btn_register.setContentAreaFilled(false);
		btn_register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				KidsRegister.main(null);
			}
		});

		JButton btn_gallery = new JButton("게시판");
		btn_gallery.setBounds(96, 409, 97, 41);
		frame.getContentPane().add(btn_gallery);
		btn_gallery.setBorderPainted(false);
		btn_gallery.setContentAreaFilled(false);
		btn_gallery.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				KidsGallery.main(null);
			}
		});

		JButton btn_avg = new JButton("통계");
		btn_avg.setBounds(96, 463, 97, 41);
		frame.getContentPane().add(btn_avg);
		btn_avg.setBorderPainted(false);
		btn_avg.setContentAreaFilled(false);
		btn_avg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				KidsAvg.main(null);
			}
		});

		JButton btn_map = new JButton("");
		btn_map.setBounds(1007, 460, 146, 140);
		frame.getContentPane().add(btn_map);
		btn_map.setBorderPainted(false);
		btn_map.setContentAreaFilled(false);
		btn_map.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				KidsMap.main(null);
			}
		});


		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.setBounds(899, 64, 58, 23);
		frame.getContentPane().add(btn_login);
		btn_login.setBorderPainted(false);
		btn_login.setContentAreaFilled(false);
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Login.main(null);

				
			}
		});

		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.setBounds(975, 64, 60, 23);
		frame.getContentPane().add(btn_join);
		btn_join.setBorderPainted(false);
		btn_join.setContentAreaFilled(false);

		JButton btn_myPage = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		btn_myPage.setBounds(1047, 64, 60, 23);
		frame.getContentPane().add(btn_myPage);
		btn_myPage.setBorderPainted(false);
		btn_myPage.setContentAreaFilled(false);

		JButton btn_library = new JButton("\uB0B4 \uC11C\uC7AC");
		btn_library.setBounds(1119, 64, 63, 23);
		frame.getContentPane().add(btn_library);
		btn_library.setBorderPainted(false);
		btn_library.setContentAreaFilled(false);

		JButton btn_home = new JButton("");
		btn_home.setBounds(33, 10, 183, 171);
		frame.getContentPane().add(btn_home);
		btn_home.setBorderPainted(false);
		btn_home.setContentAreaFilled(false);
		btn_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				KidsMain.main(null);
			}
		});
		
		URL path = this.getClass().getResource("..\\img\\KidsMain.png");
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_background = new JLabel(new ImageIcon(image.getScaledInstance(1200, 600, Image.SCALE_SMOOTH)));
		lbl_background.setBounds(0, 338, 1199, 601);
		frame.getContentPane().add(lbl_background);
		lbl_background.setBounds(0, 0, 1200, 600);

	}

}
