package MyProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class QuizApp {

	private JFrame frame;
	int score = 0;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton opt2;
	String correct;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizApp window = new QuizApp();
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
	public QuizApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1. What is my name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(56, 11, 297, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				correct = rdbtnNewRadioButton.getText();
				if(correct=="Bowei") {
					score++;
				}
				frame.setVisible(false);
				JFrame frame1 = new JFrame();
				frame1.setVisible(true);
				frame1.setBounds(100, 100, 450, 300);
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.getContentPane().setLayout(null);
				JLabel lblNewLabel1 = new JLabel("What is my favorite sport");
				lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblNewLabel1.setBounds(56, 11, 297, 30);
				frame1.getContentPane().add(lblNewLabel1);
				JButton btn1 = new JButton("Submit");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						correct = opt2.getText();
						if(correct=="volleyball") {
							score++;
						}
						frame1.setVisible(false);
						JFrame frame2 = new JFrame();
						frame2.setVisible(true);
						frame2.setBounds(100, 100, 450, 300);
						frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame2.getContentPane().setLayout(null);
						JLabel lblNewLabel2 = new JLabel("You scored : ");
						JLabel lbl = new JLabel("00");
						lbl.setFont(new Font("Tahoma",Font.PLAIN,22));
						lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 18));
						lblNewLabel2.setBounds(56, 11, 297, 30);
						frame2.getContentPane().add(lblNewLabel2);
						frame2.getContentPane().add(lbl);
						lbl.setText(score + "");
					}
				});
				btn1.setBounds(316, 229, 89, 23);
				
				
				frame1.getContentPane().add(btn1);
				
				
				JRadioButton opt1 = new JRadioButton("Basketball");
				opt1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				opt1.setBounds(37, 97, 111, 23);
				frame1.getContentPane().add(opt1);
				
				opt2 = new JRadioButton("volleyball");
				opt2.setFont(new Font("Tahoma", Font.PLAIN, 15));
				opt2.setBounds(37, 144, 111, 23);
				frame1.getContentPane().add(opt2);
				
				JRadioButton opt3 = new JRadioButton("football");
				opt3.setFont(new Font("Tahoma", Font.PLAIN, 15));
				opt3.setBounds(233, 97, 111, 23);
				frame1.getContentPane().add(opt3);
				
				JRadioButton opt4 = new JRadioButton("table tennis");
				opt4.setFont(new Font("Tahoma", Font.PLAIN, 15));
				opt4.setBounds(233, 146, 111, 23);
				frame1.getContentPane().add(opt4);
				
			}
		});
		btnNewButton.setBounds(316, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		rdbtnNewRadioButton = new JRadioButton("Bowei");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(37, 97, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnBoweii = new JRadioButton("Boweii");
		rdbtnBoweii.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnBoweii.setBounds(37, 144, 111, 23);
		frame.getContentPane().add(rdbtnBoweii);
		
		JRadioButton rdbtnBowe = new JRadioButton("Bowe");
		rdbtnBowe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnBowe.setBounds(233, 97, 111, 23);
		frame.getContentPane().add(rdbtnBowe);
		
		JRadioButton rdbtnBowii = new JRadioButton("Bowii");
		rdbtnBowii.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnBowii.setBounds(233, 146, 111, 23);
		frame.getContentPane().add(rdbtnBowii);
	}
}
