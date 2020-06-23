package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPage {

	private JFrame frame;
	Fix test = new Fix();
	int a = 0;
	private JPanel panel, panel_change;
	private JTextField txt_name;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPage window = new MyPage();
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
	public MyPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1215, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		test.sup_mix(frame);
		
		
		//////////////////////////////////////////////////////////////////

		
		panel_change = new JPanel();
		panel_change.setBounds(257, 115, 633, 395);
		frame.getContentPane().add(panel_change);
		panel_change.setLayout(null);
		panel_change.setVisible(false);

		JLabel lblNewLabel_12 = new JLabel("\uB0B4 \uC815\uBCF4");
		lblNewLabel_12.setBounds(12, 10, 81, 24);
		panel_change.add(lblNewLabel_12);

		JLabel lblNewLabel_22 = new JLabel("\uC774\uB984");
		lblNewLabel_22.setBounds(12, 44, 81, 24);
		panel_change.add(lblNewLabel_22);

		JLabel lblNewLabel_2_12 = new JLabel("PW");
		lblNewLabel_2_12.setBounds(12, 77, 81, 24);
		panel_change.add(lblNewLabel_2_12);

		JLabel lblNewLabel_2_22 = new JLabel("PW_check");
		lblNewLabel_2_22.setBounds(12, 111, 81, 24);
		panel_change.add(lblNewLabel_2_22);
		
		JLabel lblNewLabel_22_1 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_22_1.setBounds(12, 145, 81, 24);
		panel_change.add(lblNewLabel_22_1);
		
		JLabel lblNewLabel_22_2 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_22_2.setBounds(12, 186, 81, 24);
		panel_change.add(lblNewLabel_22_2);
		
		txt_name = new JTextField();
		txt_name.setText("ID");
		txt_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			txt_name.setText(null);
			}
		});
		txt_name.setBounds(76, 44, 135, 24);
		panel_change.add(txt_name);
		txt_name.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(76, 78, 135, 24);
		panel_change.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(76, 111, 135, 24);
		panel_change.add(passwordField_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 152, 135, 24);
		textField_1.setColumns(10);
		panel_change.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 220, 135, 24);
		textField_2.setColumns(10);
		panel_change.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 188, 135, 24);
		textField_3.setColumns(10);
		panel_change.add(textField_3);
		
				JLabel lbl_pNum = new JLabel("\uC774\uB984");
				lbl_pNum.setBounds(76, 111, 135, 24);
				panel_change.add(lbl_pNum);
				
						JLabel lbl_where = new JLabel("\uC774\uB984");
						lbl_where.setBounds(76, 152, 135, 24);
						panel_change.add(lbl_where);
//////////////////////////////////////////////////////////////////////////////////
			// 여기에 conn 해서 정보 수정하기 위한 코드 들어가야 함
///////////////////////////////////////////////////////////////////////////////////
						JButton btn_commit = new JButton("\uBCC0\uACBD \uC644\uB8CC");
						btn_commit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								a++;
								if (a % 2 == 0) {
									panel.setVisible(true); // panel의 시각화 유무를 결정해주는 기능
									panel_change.setVisible(false);
								} else {
									panel.setVisible(false);
									panel_change.setVisible(true);
								}
								
								
							}
						});
						btn_commit.setBounds(483, 344, 138, 41);
						panel_change.add(btn_commit);
		
		
		/////////////////////////////////////////

		panel = new JPanel();
		panel.setBounds(257, 115, 633, 395);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("\uB0B4 \uC815\uBCF4");
		lblNewLabel_1.setBounds(12, 10, 81, 24);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("\uB0B4 \uB9C8\uC77C\uB9AC\uC9C0");
		lblNewLabel_1_1.setBounds(12, 186, 81, 24);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("\uB300\uC5EC\uD55C \uCC45 \uBAA9\uB85D");
		lblNewLabel_1_2.setBounds(304, 15, 81, 24);
		panel.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("\uB0B4 \uD604\uD669");
		lblNewLabel_1_3.setBounds(304, 186, 81, 24);
		panel.add(lblNewLabel_1_3);

		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984");
		lblNewLabel_2.setBounds(12, 44, 81, 24);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setBounds(12, 77, 81, 24);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_2_2.setBounds(12, 111, 81, 24);
		panel.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2_3.setBounds(12, 145, 81, 24);
		panel.add(lblNewLabel_2_3);

		JLabel lbl_name = new JLabel("\uC774\uB984\uC758 \uC8FC\uC18C\uAC12 \uC785\uB825");
		lbl_name.setBounds(76, 44, 135, 24);
		panel.add(lbl_name);

		JLabel lbl_ID = new JLabel("id\uC8FC\uC18C\uAC12");
		lbl_ID.setBounds(76, 78, 135, 24);
		panel.add(lbl_ID);
		
		JLabel lbl_ponNum = new JLabel("\uC5F0\uB77D\uCC98 \uC8FC\uC18C\uAC12");
		lbl_ponNum.setBounds(76, 111, 135, 24);
		panel.add(lbl_ponNum);
		
		JLabel lbl_where_ = new JLabel("\uC8FC\uC18C\uC758 \uC8FC\uC18C\uAC12");
		lbl_where_.setBounds(76, 145, 135, 24);
		panel.add(lbl_where_);
		
				JButton btnNewButton = new JButton("\uBCC0\uACBD\uD558\uAE30");
				btnNewButton.setBounds(76, 11, 97, 23);
				panel.add(btnNewButton);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						a++;
						if (a % 2 == 0) {
							panel.setVisible(true); // panel의 시각화 유무를 결정해주는 기능
							panel_change.setVisible(false);
						} else {
							panel.setVisible(false);
							panel_change.setVisible(true);
						}
					}
				});

				DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
				
				dataset1.addValue(20, "장르", "범죄");
				dataset1.addValue(30, "장르", "로맨스");
				dataset1.addValue(15, "장르", "스릴러");
				dataset1.addValue(40, "장르", "19");

				
				JFreeChart barChart = ChartFactory.createBarChart("이번 달 대여", "장르","대여 수",dataset1,PlotOrientation.VERTICAL,false,false,false);
				
				Font f = new Font("Gulim",Font.BOLD,14);
				
				barChart.getTitle().setFont(f);
				
				CategoryPlot plot1 = barChart.getCategoryPlot();

				plot1.getDomainAxis().setLabelFont(f);
				plot1.getDomainAxis().setTickLabelFont(f);

				plot1.getRangeAxis().setLabelFont(f);
				plot1.getRangeAxis().setTickLabelFont(f);
				panel.setLayout(null);

				ChartPanel chartpanel = new ChartPanel(barChart);
				chartpanel.setBounds(314, 220, 307, 165);
				
				panel.add(chartpanel);
				
				JLabel lblNewLabel_3 = new JLabel("\uBC14\uCF54\uB4DC \uC774\uBBF8\uC9C0");
				lblNewLabel_3.setBounds(12, 313, 278, 72);
				panel.add(lblNewLabel_3);
				
				JLabel lblNewLabel_4 = new JLabel("\uB0B4 \uB9C8\uC77C\uB9AC\uC9C0");
				lblNewLabel_4.setBounds(12, 220, 278, 72);
				panel.add(lblNewLabel_4);
				
				JLabel lblNewLabel_5 = new JLabel("\uCC45 \uBAA9\uB85D \uBD88\uB7EC\uC624\uAE30");
				lblNewLabel_5.setBounds(304, 49, 317, 120);
				panel.add(lblNewLabel_5);

		

		Image list1 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\Project\\Map.png").getImage();
		Image image1 = list1;

		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);

	}
}
