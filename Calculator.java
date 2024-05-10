package MyProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	String[] cx = {}; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
					window.frame.setTitle("B-Calc");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}
	
    

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(61, 61, 61));
		frame.setBounds(100, 100, 346, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setBackground(new Color(49, 49, 49));
		textField.setBounds(10, 11, 312, 109);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("C");
		btnNewButton.setForeground(new Color(26, 220, 20));
		btnNewButton.setBackground(new Color(61, 61, 61));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton.setBounds(22, 162, 55, 38);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";

			}
		});
		btnNewButton_1.setForeground(new Color(26, 220, 20));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(61, 61, 61));
		btnNewButton_1.setBounds(99, 162, 55, 38);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("X");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnNewButton_1_1.setForeground(new Color(26, 220, 20));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(new Color(61, 61, 61));
		btnNewButton_1_1.setBounds(176, 162, 55, 38);
		frame.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1 = new JButton("B");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnNewButton_1_1_1.setForeground(new Color(26, 220, 20));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1.setBackground(new Color(61, 61, 61));
		btnNewButton_1_1_1.setBounds(253, 162, 55, 38);
		frame.getContentPane().add(btnNewButton_1_1_1);

		JButton buttonSeven = new JButton("7");
		buttonSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + buttonSeven.getText();
				textField.setText(number);
			}
		});
		buttonSeven.setForeground(new Color(26, 220, 20));
		buttonSeven.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonSeven.setBackground(new Color(61, 61, 61));
		buttonSeven.setBounds(22, 221, 55, 38);
		frame.getContentPane().add(buttonSeven);

		JButton buttonEight = new JButton("8");
		buttonEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + buttonEight.getText();
				textField.setText(number);
			}
		});
		buttonEight.setForeground(new Color(26, 220, 20));
		buttonEight.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonEight.setBackground(new Color(61, 61, 61));
		buttonEight.setBounds(99, 221, 55, 38);
		frame.getContentPane().add(buttonEight);

		JButton buttonNine = new JButton("9");
		buttonNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + buttonNine.getText();
				textField.setText(number);
			}
		});
		buttonNine.setForeground(new Color(26, 220, 20));
		buttonNine.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonNine.setBackground(new Color(61, 61, 61));
		buttonNine.setBounds(176, 221, 55, 38);
		frame.getContentPane().add(buttonNine);

		JButton btnNewButton_1_1_1_1 = new JButton("-");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnNewButton_1_1_1_1.setForeground(new Color(26, 220, 20));
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1_1.setBackground(new Color(61, 61, 61));
		btnNewButton_1_1_1_1.setBounds(253, 221, 55, 38);
		frame.getContentPane().add(btnNewButton_1_1_1_1);

		JButton buttonFour = new JButton("4");
		buttonFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + buttonFour.getText();
				textField.setText(number);
			}
		});
		buttonFour.setForeground(new Color(26, 220, 20));
		buttonFour.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonFour.setBackground(new Color(61, 61, 61));
		buttonFour.setBounds(22, 283, 55, 38);
		frame.getContentPane().add(buttonFour);

		JButton buttonFive = new JButton("5");
		buttonFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + buttonFive.getText();
				textField.setText(number);
			}
		});
		buttonFive.setForeground(new Color(26, 220, 20));
		buttonFive.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonFive.setBackground(new Color(61, 61, 61));
		buttonFive.setBounds(99, 283, 55, 38);
		frame.getContentPane().add(buttonFive);

		JButton buttonSix = new JButton("6");
		buttonSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + buttonSix.getText();
				textField.setText(number);
			}
		});
		buttonSix.setForeground(new Color(26, 220, 20));
		buttonSix.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonSix.setBackground(new Color(61, 61, 61));
		buttonSix.setBounds(176, 283, 55, 38);
		frame.getContentPane().add(buttonSix);

		JButton btnNewButton_1_1_1_1_1 = new JButton("+");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnNewButton_1_1_1_1_1.setForeground(new Color(26, 220, 20));
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1_1_1.setBackground(new Color(61, 61, 61));
		btnNewButton_1_1_1_1_1.setBounds(253, 283, 55, 38);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1);

		JButton buttonOne = new JButton("1");
		buttonOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + buttonOne.getText();
				textField.setText(number);
			}
		});
		buttonOne.setForeground(new Color(26, 220, 20));
		buttonOne.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonOne.setBackground(new Color(61, 61, 61));
		buttonOne.setBounds(22, 338, 55, 38);
		frame.getContentPane().add(buttonOne);

		JButton buttonTwo = new JButton("2");
		buttonTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + buttonTwo.getText();
				textField.setText(number);
			}
		});
		buttonTwo.setForeground(new Color(26, 220, 20));
		buttonTwo.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonTwo.setBackground(new Color(61, 61, 61));
		buttonTwo.setBounds(99, 338, 55, 38);
		frame.getContentPane().add(buttonTwo);

		JButton buttonThree = new JButton("3");
		buttonThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + buttonThree.getText();
				textField.setText(number);
			}
		});
		buttonThree.setForeground(new Color(26, 220, 20));
		buttonThree.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonThree.setBackground(new Color(61, 61, 61));
		buttonThree.setBounds(176, 338, 55, 38);
		frame.getContentPane().add(buttonThree);

		JButton btnNewButton_2_1_1_1 = new JButton("%");
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnNewButton_2_1_1_1.setForeground(new Color(26, 220, 20));
		btnNewButton_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2_1_1_1.setBackground(new Color(61, 61, 61));
		btnNewButton_2_1_1_1.setBounds(22, 402, 55, 38);
		frame.getContentPane().add(btnNewButton_2_1_1_1);

		JButton buttonZero = new JButton("0");
		buttonZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + buttonZero.getText();
				textField.setText(number);
			}
		});
		buttonZero.setForeground(new Color(26, 220, 20));
		buttonZero.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonZero.setBackground(new Color(61, 61, 61));
		buttonZero.setBounds(99, 402, 55, 38);
		frame.getContentPane().add(buttonZero);

		JButton btnNewButton_1_1_2_1_1_1 = new JButton(".");
		btnNewButton_1_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_1_2_1_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_1_2_1_1_1.setForeground(new Color(26, 220, 20));
		btnNewButton_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_2_1_1_1.setBackground(new Color(61, 61, 61));
		btnNewButton_1_1_2_1_1_1.setBounds(176, 402, 55, 38);
		frame.getContentPane().add(btnNewButton_1_1_2_1_1_1);

		JButton btnNewButton_1_1_1_1_1_1_1 = new JButton("=");
		btnNewButton_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "*"){
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				if(textField.getText()=="2468") {
					
				}
				
			}
		});
		
		
		btnNewButton_1_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1_1_1_1_1.setBackground(new Color(26, 220, 20));
		btnNewButton_1_1_1_1_1_1_1.setBounds(253, 332, 55, 108);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_1);
		
	}
}
