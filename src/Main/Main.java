package Main;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Main {

	JFrame frame;
	int cnt = 0;

	Fix test = new Fix();
	Login log = new Login();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1215, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Image[] list = new Image[3];
		list[0] = new ImageIcon("C:\\Users\\SHMRD\\Pictures\\Screenshots\\121.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SHMRD\\Pictures\\Screenshots\\1.png").getImage();
		list[2] = new ImageIcon("C:\\Users\\SHMRD\\Pictures\\Screenshots\\2.png").getImage();

		Image image = list[cnt];

		test.sup_mix(frame);

		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(220, 180, 680, 390);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_book1 = new JLabel("");
		URL path_book1 = this.getClass().getResource("..\\img\\book1.png");
		Image image_book1 = new ImageIcon(path_book1).getImage();
		lbl_book1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				URL path_book1 = this.getClass().getResource("..\\img\\book1_info.png");
				Image image_book1 = new ImageIcon(path_book1).getImage();
				
				lbl_book1.setIcon(new ImageIcon(image_book1.getScaledInstance(220, 325, Image.SCALE_SMOOTH)));
			}
			public void mouseExited(MouseEvent e) {
				
				
				lbl_book1.setIcon(new ImageIcon(image_book1.getScaledInstance(220, 325, image.SCALE_REPLICATE)));

			}
		});
		lbl_book1.setBounds(0, 10, 220, 325);
		lbl_book1.setIcon(new ImageIcon(image_book1.getScaledInstance(220, 325, image.SCALE_REPLICATE)));
		panel.add(lbl_book1);
		lbl_book1.setBounds(0, 10, 220, 325);
		panel.add(lbl_book1);
		

//		JButton btnNewButton = new JButton("New button");
//		URL path_book1 = this.getClass().getResource("..\\img\\book1.png");
//		Image image_book1 = new ImageIcon(path_book1).getImage();
//		btnNewButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				URL path_book12 = this.getClass().getResource("..\\img\\book1_info.png");
//				Image image_book12 = new ImageIcon(path_book12).getImage();
//				
//				
//				btnNewButton.setIcon(new ImageIcon(image_book12.getScaledInstance(220, 325, Image.SCALE_SMOOTH)));
//
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				
//				
//				
//				btnNewButton.setIcon(new ImageIcon(image_book1));
//
//			}
//		});
//		btnNewButton.setBounds(0, 10, 220, 325);
//		btnNewButton.setIcon(new ImageIcon(image_book1));
//		panel.add(btnNewButton);
		
		JLabel lbl_book2 = new JLabel("");
		URL path_book2 = this.getClass().getResource("..\\img\\book2.png");
		Image image_book2 = new ImageIcon(path_book2).getImage();
		lbl_book2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				URL path_book2 = this.getClass().getResource("..\\img\\book2_info.png");
				Image image_book2 = new ImageIcon(path_book2).getImage();
				
				lbl_book2.setIcon(new ImageIcon(image_book2.getScaledInstance(220, 325, Image.SCALE_SMOOTH)));
			}
			public void mouseExited(MouseEvent e) {
				
				
				lbl_book2.setIcon(new ImageIcon(image_book2.getScaledInstance(220, 325, image.SCALE_REPLICATE)));

			}
		});
		lbl_book2.setBounds(230, 10, 220, 338);
		lbl_book2.setIcon(new ImageIcon(image_book2.getScaledInstance(220, 325, image.SCALE_REPLICATE)));
		panel.add(lbl_book2);
		lbl_book2.setBounds(230, 10, 220, 325);
		panel.add(lbl_book2);
		
		
//		JButton btn_book2 = new JButton("New button");
//		URL path_book2 = this.getClass().getResource("..\\img\\book2.png");
//		Image image_book2 = new ImageIcon(path_book2).getImage();
//		btn_book2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				URL path_book2 = this.getClass().getResource("..\\img\\book2_info.png");
//				Image image_book2 = new ImageIcon(path_book2).getImage();
//				
//				
//				btn_book2.setIcon(new ImageIcon(image_book2.getScaledInstance(220, 325, Image.SCALE_SMOOTH)));
//
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				
//				
//				
//				btn_book2.setIcon(new ImageIcon(image_book2));
			
		JLabel lbl_book3 = new JLabel("");
		URL path_book3 = this.getClass().getResource("..\\img\\book3.png");
		Image image_book3 = new ImageIcon(path_book3).getImage();
		lbl_book3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				URL path_book3 = this.getClass().getResource("..\\img\\book3_info.png");
				Image image_book3 = new ImageIcon(path_book3).getImage();
				
				lbl_book3.setIcon(new ImageIcon(image_book3.getScaledInstance(220, 325, Image.SCALE_SMOOTH)));
			}
			public void mouseExited(MouseEvent e) {
				
				
				lbl_book3.setIcon(new ImageIcon(image_book3.getScaledInstance(220, 325, image.SCALE_REPLICATE)));

			}
		});
		lbl_book3.setBounds(460, 10, 220, 325);
		lbl_book3.setIcon(new ImageIcon(image_book3.getScaledInstance(220, 325, image.SCALE_REPLICATE)));
		panel.add(lbl_book3);
		lbl_book3.setBounds(460, 10, 220, 325);
		panel.add(lbl_book3);

		
		JLabel lbl_reco = new JLabel("\uC774 \uB2EC\uC758 \uCD94\uCC9C \uB3C4\uC11C");
		lbl_reco.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_reco.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 25));
		lbl_reco.setBounds(435, 130, 250, 50);
		frame.getContentPane().add(lbl_reco);
		
		URL path = this.getClass().getResource("..\\img\\Map.png");
		Image image1 = new ImageIcon(path).getImage();
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);
	}
}
