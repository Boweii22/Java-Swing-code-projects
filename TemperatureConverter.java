package MyProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TemperatureConverter {

	private JFrame frame;
	private JTextField textField;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JLabel AnswerLabel;
	double result;
	double text;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton CalculateButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureConverter window = new TemperatureConverter();
					window.frame.setVisible(true);
					window.frame.setTitle("Temperature converter");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TemperatureConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 68, 0));
		frame.setBounds(100, 100, 578, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 286, 263);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Temperature");
		lblNewLabel.setForeground(new Color(0, 68, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 11, 158, 21);
		panel.add(lblNewLabel);
		
		String[] converts = {"Celsius", "Farenheit","Kelvin"};
		
		comboBox = new JComboBox(converts);
		comboBox.setBackground(new Color(0, 68, 0));
		comboBox.setBounds(153, 81, 61, 22);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBackground(new Color(36, 36, 36));
		textField.setBounds(10, 82, 140, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		comboBox_1 = new JComboBox(converts);
		comboBox_1.setForeground(new Color(255, 255, 255));
		comboBox_1.setBackground(new Color(36, 36, 36));
		comboBox_1.setBounds(10, 161, 140, 22);
		panel.add(comboBox_1);
		
		CalculateButton = new JButton("Convert");
		CalculateButton.setBackground(new Color(0, 68, 0));
		CalculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox.getSelectedItem();
				String selectedOption1 = (String) comboBox_1.getSelectedItem();
				if(selectedOption=="Celsius" && selectedOption1=="Farenheit") {
					text = Double.parseDouble(textField.getText());
					result = (text * 1.8) + 32;
					AnswerLabel.setText(Double.toString(result));		
					System.out.println(result);
				}else if(selectedOption=="Celsius" && selectedOption1=="Kelvin") {
					text = Double.parseDouble(textField.getText());
					result = text + 273.15;
					AnswerLabel.setText(Double.toString(result));		
					System.out.println(result);
				}else if(selectedOption=="Farenheit" && selectedOption1=="Celsius") {	
					text = Double.parseDouble(textField.getText());
					result = (text-32) * 0.56;
					AnswerLabel.setText(Double.toString(result));		
					System.out.println(result);
				}else if(selectedOption=="Farenheit" && selectedOption1=="Kelvin") {
					text = Double.parseDouble(textField.getText());
					result = (text-32)*0.56+273.15;
					AnswerLabel.setText(Double.toString(result));		
					System.out.println(result);
				}else if(selectedOption=="Kelvin"&& selectedOption1 == "Celsius") {
					text = Double.parseDouble(textField.getText());
					result = text - 273.15;
					AnswerLabel.setText(Double.toString(result));		
					System.out.println(result);
				}else if(selectedOption=="Kelvin"&& selectedOption1=="Farenheit") {
					text = Double.parseDouble(textField.getText());
					result = (text-273.15) * 1.8+32;
					AnswerLabel.setText(Double.toString(result));		
					System.out.println(result);
				}else {
					AnswerLabel.setText(Double.toString(Double.parseDouble(textField.getText())));
				}
			}
		});
		CalculateButton.setBounds(79, 214, 89, 23);
		panel.add(CalculateButton);
		
		lblNewLabel_1 = new JLabel("Degree");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(new Color(0, 68, 0));
		lblNewLabel_1.setBounds(10, 43, 68, 28);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Convert To");
		lblNewLabel_2.setForeground(new Color(0, 68, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 122, 115, 28);
		panel.add(lblNewLabel_2);
		
		
		AnswerLabel = new JLabel("        A");
		AnswerLabel.setForeground(new Color(255, 255, 255));
		AnswerLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		AnswerLabel.setBounds(287, 50, 277, 126);
		frame.getContentPane().add(AnswerLabel);
	}
}
