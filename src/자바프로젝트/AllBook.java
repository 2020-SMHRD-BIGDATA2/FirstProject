package 자바프로젝트;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AllBook {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllBook window = new AllBook();
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
	public AllBook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1215, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\ProjectIcon\\Book.png";
		Image image = new ImageIcon(path).getImage();
		JLabel lbl_background = new JLabel(new ImageIcon(image.getScaledInstance(1200, 600, Image.SCALE_SMOOTH)));
		lbl_background.setBounds(0, 0, 1200, 600);
		frame.getContentPane().add(lbl_background);
		
		
		lbl_background.setBounds(0,0,1200,600);
	}

}
