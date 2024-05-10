package MyProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BankApp {

	private JFrame frame;
	private ImageIcon image;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField bvnField;
	private JCheckBox chckbxNewCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankApp window = new BankApp();
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
	public BankApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("B");
		lblNewLabel.setFont(new Font("Curlz MT", Font.BOLD, 42));
		lblNewLabel.setBounds(32, 11, 36, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to the Beta-Bank");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(32, 64, 379, 71);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New level of features");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(42, 120, 158, 39);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				JFrame signup = new JFrame();
				signup.setVisible(true);
				signup.getContentPane().setBackground(new Color(53, 81, 94));
				signup.setBounds(100, 100, 619, 351);
				signup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				signup.getContentPane().setLayout(null);
				JPanel panel = new JPanel();
				panel.setBackground(new Color(255, 255, 255));
				panel.setBounds(0, 0, 308,314);
				panel.setLayout(null);
				signup.getContentPane().add(panel);
				
				JLabel panelLabel = new JLabel("Sign-up Page");
				panelLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
				panelLabel.setBounds(103, 128, 120, 30);
				panel.add(panelLabel);
				
				JButton btnDontHaveAn = new JButton("Already have an account? Login");
				btnDontHaveAn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						signup.setVisible(false);
						JFrame login = new JFrame();
						login.getContentPane().setBackground(new Color(53, 81, 94));
						login.setBounds(100, 100, 578, 335);
						login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						login.getContentPane().setLayout(null);
						login.setVisible(true);
						JPanel panel1 = new JPanel();
						panel1.setBounds(0, 0, 256, 298);
						login.getContentPane().add(panel1);
						panel1.setLayout(null);
						
						JLabel labels = new JLabel("Login Page");
						labels.setFont(new Font("Tahoma", Font.PLAIN, 28));
						labels.setBounds(58, 125, 151, 34);
						panel1.add(labels);
						
						JLabel labell = new JLabel("BVN");
						labell.setFont(new Font("Tahoma", Font.PLAIN, 23));
						labell.setForeground(new Color(255, 255, 255));
						labell.setBounds(333, 89, 110, 33);
						login.getContentPane().add(labell);
						
						bvnField = new JTextField();
						bvnField.setBounds(333, 133, 157, 33);
						login.getContentPane().add(bvnField);
						bvnField.setColumns(10);
						
						JButton btn = new JButton("Login");
						btn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
							}
						});
						btn.setBackground(new Color(255, 255, 255));
						btn.setBounds(449, 224, 89, 23);
						login.getContentPane().add(btn);
					}
				});
				btnDontHaveAn.setBounds(0, 291, 308, 23);
				panel.add(btnDontHaveAn);
				btnDontHaveAn.setForeground(new Color(255, 255, 255));
				btnDontHaveAn.setBackground(new Color(53, 81, 94));
				
				JLabel lblUsername_2 = new JLabel("username");
				lblUsername_2.setForeground(Color.WHITE);
				lblUsername_2.setBounds(347, 123, 99, 14);
				signup.getContentPane().add(lblUsername_2);
				
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(347, 148, 222, 20);
				signup.getContentPane().add(textField_2);
				
				JLabel lblUsername_2_1 = new JLabel("password");
				lblUsername_2_1.setForeground(Color.WHITE);
				lblUsername_2_1.setBounds(347, 184, 117, 14);
				signup.getContentPane().add(lblUsername_2_1);
				
				passwordField = new JPasswordField();
				passwordField.setBounds(347, 218, 222, 20);
				signup.getContentPane().add(passwordField);
				
				JButton btnNewButton = new JButton("Sign up");
				btnNewButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							FileWriter data = new FileWriter("C:\\Users\\Bowei\\Documents\\BankData");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
					
				});
				btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton.setBounds(506, 280, 89, 23);
				signup.getContentPane().add(btnNewButton);
				
				chckbxNewCheckBox = new JCheckBox("show password");
				chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
				chckbxNewCheckBox.setBackground(new Color(53, 81, 94));
				chckbxNewCheckBox.setBounds(347, 250, 137, 23);
				chckbxNewCheckBox.addItemListener(new ItemListener() {
					@SuppressWarnings("deprecation")
					public void itemStateChanged(ItemEvent e) {
						if (chckbxNewCheckBox.isSelected()) {
		                    passwordField.setEchoChar((char) 0); // Show password as plain text
		                } else {
		                    passwordField.setEchoChar('\u2022'); // Show password as masked with bullets
		                }
					}
				});
				signup.getContentPane().add(chckbxNewCheckBox);
			}
		});
		btnNewButton.setBackground(new Color(53, 81, 94));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(42, 183, 205, 32);
		frame.getContentPane().add(btnNewButton);
	}
	public void emailArray(String...args) {
		
	}
}
