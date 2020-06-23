package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JPanel;
import java.awt.Color;

public class Avg {

	private JFrame frame;
	Fix test = new Fix();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Avg window = new Avg();
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
	public Avg() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(220, 180, 680, 390);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
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
		chartpanel.setBounds(10, 76, 297, 304);
		
		panel.add(chartpanel);
		
		Image list1 = new ImageIcon("C:\\Users\\SHMRD\\Desktop\\Project\\Avg.png").getImage();
		Image image1 = list1;

		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1199, 601);
		frame.getContentPane().add(lblNewLabel);
	}
}