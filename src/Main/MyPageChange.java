package Main;

import java.awt.EventQueue;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPageChange {

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_phoneNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPageChange window = new MyPageChange();
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
	public MyPageChange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 330, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 314, 331);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lbl_myInfo = new JLabel("\uB0B4 \uC815\uBCF4");
		lbl_myInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_myInfo.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 27));
		lbl_myInfo.setBounds(84, 35, 129, 45);
		panel.add(lbl_myInfo);
		
		JLabel lbl_namae = new JLabel("\uC774\uB984");
		lbl_namae.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_namae.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 15));
		lbl_namae.setBounds(12, 113, 57, 15);
		panel.add(lbl_namae);
		
		JLabel lbl_phoneNumber = new JLabel("\uC5F0\uB77D\uCC98");
		lbl_phoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_phoneNumber.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 15));
		lbl_phoneNumber.setBounds(12, 165, 57, 15);
		panel.add(lbl_phoneNumber);
		
		JLabel lbl_address = new JLabel("\uC8FC\uC18C");
		lbl_address.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_address.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 15));
		lbl_address.setBounds(12, 220, 57, 15);
		panel.add(lbl_address);
		
		
		txt_name = new JTextField();
		txt_name.setBounds(74, 109, 155, 25);
		panel.add(txt_name);
		txt_name.setColumns(10);
		
		txt_phoneNumber = new JTextField();
		txt_phoneNumber.setColumns(10);
		txt_phoneNumber.setBounds(74, 163, 155, 25);
		panel.add(txt_phoneNumber);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 217, 155, 25);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		JButton btn_nameChange = new JButton("");
		btn_nameChange.setBounds(250, 107, 52, 33);
		btn_nameChange.setBorderPainted(false);
	    btn_nameChange.setContentAreaFilled(false);
		panel.add(btn_nameChange);
		
		JButton btn_pnChange = new JButton("");
		btn_pnChange.setBounds(250, 162, 52, 33);
		btn_pnChange.setBorderPainted(false);
		btn_pnChange.setContentAreaFilled(false);
		panel.add(btn_pnChange);
		
		JButton btn_addChange = new JButton("");
		btn_addChange.setBounds(250, 212, 52, 33);
		btn_addChange.setBorderPainted(false);
		btn_addChange.setContentAreaFilled(false);
		panel.add(btn_addChange);
		
		
		JButton btnNewButton = new JButton("\uC644   \uB8CC");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 15));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(74, 267, 155, 30);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		panel.add(btnNewButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("\uBCC0\uACBD");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(247, 110, 55, 27);
		panel.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBCC0\uACBD");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(247, 163, 55, 27);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uBCC0\uACBD");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(247, 215, 55, 27);
		panel.add(lblNewLabel_1_2);
		
		URL path = this.getClass().getResource("..\\img\\change.png");
		Image image = new ImageIcon(path).getImage();
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(250, 230, Image.SCALE_REPLICATE)));
		lblNewLabel.setBounds(62, 90, 250, 230);
		panel.add(lblNewLabel);
		
////		JLabel lblNewLabel = new JLabel("");
////		lblNewLabel.setBounds(0, 0, 343, 411);
////		frame.getContentPane().add(lblNewLabel);
//		
	}

}
