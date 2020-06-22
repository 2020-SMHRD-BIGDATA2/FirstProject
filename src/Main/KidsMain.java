package Main;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

		String path = "C:\\Users\\SMHRD\\Desktop\\Project\\KidsMain.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_background = new JLabel(new ImageIcon(image.getScaledInstance(1200, 600, Image.SCALE_SMOOTH)));

		lbl_background.setBounds(0, 338, 1199, 601);
		frame.getContentPane().add(lbl_background);

		lbl_background.setBounds(0, 0, 1200, 600);

		kf.kidsFix(frame);

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

	}

}
