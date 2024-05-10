package MyProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tryLogin {

	private JFrame frame;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tryLogin window = new tryLogin();
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
	public tryLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(53, 81, 94));
		frame.setBounds(100, 100, 619, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 308, 314);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Login page");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(103, 128, 93, 30);
		panel.add(lblNewLabel_1);
		
		JButton btnDontHaveAn = new JButton("Dont have an account? sign up");
		btnDontHaveAn.setBounds(0, 291, 308, 23);
		panel.add(btnDontHaveAn);
		btnDontHaveAn.setForeground(new Color(255, 255, 255));
		btnDontHaveAn.setBackground(new Color(53, 81, 94));
		
		JLabel lblUsername_2 = new JLabel("username");
		lblUsername_2.setForeground(Color.WHITE);
		lblUsername_2.setBounds(336, 62, 99, 14);
		frame.getContentPane().add(lblUsername_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(336, 87, 222, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblUsername_2_1 = new JLabel("password");
		lblUsername_2_1.setForeground(Color.WHITE);
		lblUsername_2_1.setBounds(336, 123, 117, 14);
		frame.getContentPane().add(lblUsername_2_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(336, 157, 222, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(495, 219, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("show password");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(53, 81, 94));
		chckbxNewCheckBox.setBounds(336, 189, 137, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
	}
}
