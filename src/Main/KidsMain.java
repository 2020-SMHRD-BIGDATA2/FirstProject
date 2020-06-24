package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;

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

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(220, 180, 680, 390);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lbl_book1 = new JLabel("");
		URL path_book1 = this.getClass().getResource("..\\img\\KidsBook1.png");
		Image image_book1 = new ImageIcon(path_book1).getImage();
		lbl_book1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				URL path_book1 = this.getClass().getResource("..\\img\\KidsBook1_info.png");
				Image image_book1 = new ImageIcon(path_book1).getImage();

				lbl_book1.setIcon(new ImageIcon(image_book1.getScaledInstance(220, 325, Image.SCALE_SMOOTH)));
			}

			public void mouseExited(MouseEvent e) {

				lbl_book1.setIcon(new ImageIcon(image_book1.getScaledInstance(220, 325, Image.SCALE_REPLICATE)));

			}
		});
		lbl_book1.setBounds(0, 10, 220, 325);
		lbl_book1.setIcon(new ImageIcon(image_book1.getScaledInstance(220, 325, Image.SCALE_REPLICATE)));
		panel.add(lbl_book1);
		lbl_book1.setBounds(0, 10, 220, 325);
		panel.add(lbl_book1);

		JLabel lbl_book2 = new JLabel("");
		URL path_book2 = this.getClass().getResource("..\\img\\KidsBook2.png");
		Image image_book2 = new ImageIcon(path_book2).getImage();
		lbl_book2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				URL path_book2 = this.getClass().getResource("..\\img\\KidsBook2_info.png");
				Image image_book2 = new ImageIcon(path_book2).getImage();

				lbl_book2.setIcon(new ImageIcon(image_book2.getScaledInstance(220, 325, Image.SCALE_SMOOTH)));
			}

			public void mouseExited(MouseEvent e) {

				lbl_book2.setIcon(new ImageIcon(image_book2.getScaledInstance(220, 325, Image.SCALE_REPLICATE)));

			}
		});
		lbl_book2.setBounds(230, 10, 220, 325);
		lbl_book2.setIcon(new ImageIcon(image_book2.getScaledInstance(220, 325, Image.SCALE_REPLICATE)));
		panel.add(lbl_book2);
		lbl_book2.setBounds(230, 10, 220, 325);
		panel.add(lbl_book2);

		JLabel lbl_book3 = new JLabel("");
		URL path_book3 = this.getClass().getResource("..\\img\\KidsBook3.png");
		Image image_book3 = new ImageIcon(path_book3).getImage();
		lbl_book3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				URL path_book3 = this.getClass().getResource("..\\img\\KidsBook3_info.png");
				Image image_book3 = new ImageIcon(path_book3).getImage();

				lbl_book3.setIcon(new ImageIcon(image_book3.getScaledInstance(220, 325, Image.SCALE_SMOOTH)));
			}

			public void mouseExited(MouseEvent e) {

				lbl_book3.setIcon(new ImageIcon(image_book3.getScaledInstance(220, 325, Image.SCALE_REPLICATE)));

			}
		});
		lbl_book3.setBounds(460, 10, 220, 325);
		lbl_book3.setIcon(new ImageIcon(image_book3.getScaledInstance(220, 325, Image.SCALE_REPLICATE)));
		panel.add(lbl_book3);
		lbl_book3.setBounds(460, 10, 220, 325);
		panel.add(lbl_book3);

		JLabel lbl_reco = new JLabel("\uC774 \uB2EC\uC758 \uCD94\uCC9C \uB3C4\uC11C");
		lbl_reco.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_reco.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 25));
		lbl_reco.setBounds(435, 130, 250, 50);
		frame.getContentPane().add(lbl_reco);
		
		URL path = this.getClass().getResource("..\\img\\KidsMap.png");
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_background = new JLabel(new ImageIcon(image.getScaledInstance(1200, 600, Image.SCALE_SMOOTH)));
		lbl_background.setBounds(0, 338, 1199, 601);
		frame.getContentPane().add(lbl_background);
		lbl_background.setBounds(0, 0, 1200, 600);
	}

}
