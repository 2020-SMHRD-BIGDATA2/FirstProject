package Main;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class KidsFix {
	public void kidsFix(JFrame frame) {
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

		JButton btn_best = new JButton("BEST");
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

		JButton btn_allAge = new JButton("\uC804\uC5F0\uB839");
		btn_allAge.setBounds(96, 303, 97, 41);
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

		JButton btn_register = new JButton("\uAC8C\uC2DC\uD310");
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

		JButton btn_gallery = new JButton("\uD1B5\uACC4");
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

		JButton btn_avg = new JButton("\uB3C4\uC11C\uAD00 \uC18C\uAC1C");
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

		JButton btn_join = new JButton("New button");
		btn_join.setBounds(975, 64, 60, 23);
		frame.getContentPane().add(btn_join);
		btn_join.setBorderPainted(false);
		btn_join.setContentAreaFilled(false);

		JButton btn_myPage = new JButton("New button");
		btn_myPage.setBounds(1047, 64, 60, 23);
		frame.getContentPane().add(btn_myPage);
		btn_myPage.setBorderPainted(false);
		btn_myPage.setContentAreaFilled(false);

		JButton btn_library = new JButton("New button");
		btn_library.setBounds(1119, 64, 63, 23);
		frame.getContentPane().add(btn_library);
		btn_library.setBorderPainted(false);
		btn_library.setContentAreaFilled(false);

		JButton btn_home = new JButton("New button");
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
		
		

	}
}
