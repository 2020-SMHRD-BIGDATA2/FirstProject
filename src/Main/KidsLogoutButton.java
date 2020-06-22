package Main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class KidsLogoutButton {
	public void KidsLogoutButton(JFrame frame){
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.setBounds(899, 64, 58, 23);
		frame.getContentPane().add(btn_login);
		btn_login.setBorderPainted(false);
		btn_login.setContentAreaFilled(false);
	}
}
