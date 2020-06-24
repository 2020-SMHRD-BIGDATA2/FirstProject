package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.net.URL;
import java.awt.Color;
import javax.swing.JScrollPane;

public class MyPage {

   private JFrame frame;
   Fix test = new Fix();
   int a = 0;
   private JPanel panel;
   private JTextField txt_name1;
   private JTextField txt_id1;
   private JTextField txt_phoneName1;
   private JPasswordField passwordField_2;
   private JTextField textField;
   private JButton btn_change;

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

      /////////////////////////////////////////

      panel = new JPanel();
      panel.setBackground(Color.WHITE);
      panel.setBounds(220, 180, 680, 390);
      frame.getContentPane().add(panel);
      panel.setLayout(null);

//      JButton btnNewButton = new JButton("");
//      btnNewButton.setBounds(475, 28, 81, 27);
//      panel.add(btnNewButton);
//      btnNewButton.addActionListener(new ActionListener() {
//         public void actionPerformed(ActionEvent e) {
//            a++;
//            if (a % 2 == 0) {
//               panel.setVisible(true); // panel의 시각화 유무를 결정해주는 기능
//               panel_change.setVisible(false);
//            } else {
//               panel.setVisible(false);
//               panel_change.setVisible(true);
//            }
//         }
//      });

      DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();

      dataset1.addValue(2, "장르", "범죄");
      dataset1.addValue(3, "장르", "로맨스");
      dataset1.addValue(1, "장르", "스릴러");
      dataset1.addValue(4, "장르", "19");

      JFreeChart barChart = ChartFactory.createBarChart("이번 달 대여", "장르", "대여 수", dataset1, PlotOrientation.VERTICAL,
            false, false, false);

      Font f = new Font("Gulim", Font.BOLD, 14);

      barChart.getTitle().setFont(f);

      CategoryPlot plot1 = barChart.getCategoryPlot();

      plot1.getDomainAxis().setLabelFont(f);
      plot1.getDomainAxis().setTickLabelFont(f);

      plot1.getRangeAxis().setLabelFont(f);
      plot1.getRangeAxis().setTickLabelFont(f);
      panel.setLayout(null);

//      JLabel lblNewLabel_4 = new JLabel("\uB0B4 \uB9C8\uC77C\uB9AC\uC9C0");
//      lblNewLabel_4.setBounds(12, 220, 278, 72);
//      panel.add(lblNewLabel_4);
//      
//      JLabel lbl_myPage = new JLabel("");
//      lbl_myPage.setBounds(0, 0, 680, 390);
//      panel.add(lbl_myPage);
      
      
      txt_name1 = new JTextField();
      txt_name1.setBounds(475, 73, 145, 25);
      panel.add(txt_name1);
      txt_name1.setColumns(10);
      
      
      txt_id1 = new JTextField();
      txt_id1.setColumns(10);
      txt_id1.setBounds(475, 113, 145, 25);
      panel.add(txt_id1);
      
      txt_phoneName1 = new JTextField();
      txt_phoneName1.setColumns(10);
      txt_phoneName1.setBounds(475, 155, 145, 25);
      panel.add(txt_phoneName1);

      
      passwordField_2 = new JPasswordField();
      passwordField_2.setBounds(139, 110, 145, 23);
      panel.add(passwordField_2);
      
      JButton btn_money = new JButton("");
      btn_money.setBounds(567, 276, 81, 27);
      btn_money.setBorderPainted(false);
      btn_money.setContentAreaFilled(false);
      panel.add(btn_money);
      
      JButton btn_pwOK = new JButton("");
      btn_pwOK.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		
      		JOptionPane.showMessageDialog(null, "비밀번호 확인 완료", "확인", JOptionPane.INFORMATION_MESSAGE);
      	}
      });
      btn_pwOK.setBounds(302, 109, 48, 27);
      btn_pwOK.setBorderPainted(false);
      btn_pwOK.setContentAreaFilled(false);
      panel.add(btn_pwOK);
      
      textField = new JTextField();
      textField.setColumns(10);
      textField.setBounds(409, 279, 127, 25);
      panel.add(textField);
      
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBounds(475, 195, 145, 25);
      panel.add(scrollPane);
      
      JTextArea textArea = new JTextArea();
      scrollPane.setViewportView(textArea);
      
      
      btn_change = new JButton("");
      btn_change.setBounds(475, 25, 81, 27);
      btn_change.setBorderPainted(false);
      btn_change.setContentAreaFilled(false);
      panel.add(btn_change);
      
      URL path_myPage = this.getClass().getResource("..\\img\\myPage.png");
      Image image_myPage = new ImageIcon(path_myPage).getImage();
      
      JLabel lbl_myPage = new JLabel(new ImageIcon(image_myPage.getScaledInstance(620, 340, Image.SCALE_REPLICATE)));
      lbl_myPage.setBounds(50, 0, 620, 340);
      panel.add(lbl_myPage);
      
      URL path1 = this.getClass().getResource("..\\img\\main.png");
      Image image1 = new ImageIcon(path1).getImage();

      JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(1215, 640, Image.SCALE_SMOOTH)));
      lblNewLabel.setBounds(0, 0, 1199, 601);
      frame.getContentPane().add(lblNewLabel);

   }
}