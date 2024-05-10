package MyProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TemperatureConvert {

	private JFrame frame;
	private JTextField textField;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_3;
	double text;
	double result;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureConvert window = new TemperatureConvert();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
					window.frame.setTitle("Temperture Converter   v1.0");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TemperatureConvert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 526, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 64, 0));
		panel.setBounds(0, 0, 253, 319);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(126, 5, 1, 1);
		panel.add(desktopPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(72, 58, 181, 185);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Degree");
		lblNewLabel_2.setBounds(10, 11, 51, 20);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(0, 64, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setBackground(new Color(40, 40, 40));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBounds(10, 42, 76, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		String[] degrees = {"Celsius","Farenheit","Kelvin"};
		comboBox = new JComboBox(degrees);
		comboBox.setBackground(new Color(40, 40, 40));
		comboBox.setBounds(82, 41, 76, 22);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_2_1 = new JLabel("Convert  To");
		lblNewLabel_2_1.setForeground(new Color(0, 64, 0));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(10, 79, 96, 20);
		panel_1.add(lblNewLabel_2_1);
		
		comboBox_1 = new JComboBox(degrees);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setForeground(new Color(255, 255, 255));
		comboBox_1.setBackground(new Color(40, 40, 40));
		comboBox_1.setBounds(10, 110, 161, 22);
		panel_1.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox.getSelectedItem();
				String selectedOption1 = (String) comboBox_1.getSelectedItem();
				if(selectedOption=="Celsius" && selectedOption1=="Farenheit") {
					text = Double.parseDouble(textField.getText());
					result = (text * 1.8) + 32;
					lblNewLabel_3.setText(Double.toString(result));		
					System.out.println(String.format("%.2f", result));
				}else if(selectedOption=="Celsius" && selectedOption1=="Kelvin") {
					text = Double.parseDouble(textField.getText());
					result = text + 273.15;
					lblNewLabel_3.setText(Double.toString(result));		
					System.out.println(String.format("%.2f", result));
				}else if(selectedOption=="Farenheit" && selectedOption1=="Celsius") {	
					text = Double.parseDouble(textField.getText());
					result = (text-32) * 0.56;
					lblNewLabel_3.setText(Double.toString(result));		
					System.out.println(String.format("%.2f", result));
				}else if(selectedOption=="Farenheit" && selectedOption1=="Kelvin") {
					text = Double.parseDouble(textField.getText());
					result = (text-32)*0.56+273.15;
					lblNewLabel_3.setText(Double.toString(result));		
					System.out.println(String.format("%.2f", result));
				}else if(selectedOption=="Kelvin"&& selectedOption1 == "Celsius") {
					text = Double.parseDouble(textField.getText());
					result = text - 273.15;
					lblNewLabel_3.setText(Double.toString(result));		
					System.out.println(String.format("%.2f", result));
				}else if(selectedOption=="Kelvin"&& selectedOption1=="Farenheit") {
					text = Double.parseDouble(textField.getText());
					result = (text-273.15) * 1.8+32;
					lblNewLabel_3.setText(Double.toString(result));		
					System.out.println(String.format("%.2f", result));
				}else {
					lblNewLabel_3.setText(Double.toString(Double.parseDouble(textField.getText())));
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 64, 0));
		btnNewButton.setBounds(47, 151, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("TEMPERATURE");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(116, 5, 137, 22);
		panel.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 64, 0));
		panel_1_1.setBounds(254, 59, 181, 185);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		lblNewLabel_3 = new JLabel("            A");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(0, 60, 181, 65);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("CONVERTER");
		lblNewLabel_1.setForeground(new Color(0, 64, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(263, 0, 137, 29);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
