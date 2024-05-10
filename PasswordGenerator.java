package MyProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.xml.stream.events.Characters;

public class PasswordGenerator {

	private JFrame frame;
	private JSpinner spinner;
	private JTextPane textPane;
	private JCheckBox NumbersCheckBox;
	private JCheckBox UpperCheckBox;
	private JCheckBox LowerCheckBox;
	private JCheckBox SymbolCheckBox;
	private JCheckBox SpaceCheckBox;
	String numbers = "1234567890";
	String Lowercase = "abcdefghijklmnopqrstuvwxyz";
	String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String symbols = "!@#$%^&*()_+|/><";
	String space = " ";
	String passwordSet = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordGenerator window = new PasswordGenerator();
					window.frame.setVisible(true);
					window.frame.setTitle("Password Generator  v1.0");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PasswordGenerator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(236, 255, 255));
		frame.setBounds(100, 100, 428, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, 12, 1);
		spinner = new JSpinner(spinnerModel);
		spinner.setBounds(93, 29, 217, 20);
		frame.getContentPane().add(spinner);

		JLabel lblNewLabel = new JLabel("Lenght");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(93, 4, 77, 22);
		frame.getContentPane().add(lblNewLabel);

		NumbersCheckBox = new JCheckBox("Numbers");
		NumbersCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NumbersCheckBox.setBackground(new Color(255, 255, 255));
		NumbersCheckBox.setBounds(93, 56, 217, 23);
		frame.getContentPane().add(NumbersCheckBox);

		LowerCheckBox = new JCheckBox("LowerCase");
		LowerCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		LowerCheckBox.setBackground(Color.WHITE);
		LowerCheckBox.setBounds(93, 82, 217, 23);
		frame.getContentPane().add(LowerCheckBox);

		UpperCheckBox = new JCheckBox("UpperCase");
		UpperCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		UpperCheckBox.setBackground(Color.WHITE);
		UpperCheckBox.setBounds(93, 108, 217, 23);
		frame.getContentPane().add(UpperCheckBox);

		SymbolCheckBox = new JCheckBox("Symbols");
		SymbolCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		SymbolCheckBox.setBackground(Color.WHITE);
		SymbolCheckBox.setBounds(93, 134, 217, 23);
		frame.getContentPane().add(SymbolCheckBox);

		SpaceCheckBox = new JCheckBox("Spaces");
		SpaceCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		SpaceCheckBox.setBackground(Color.WHITE);
		SpaceCheckBox.setBounds(93, 160, 217, 23);
		frame.getContentPane().add(SpaceCheckBox);

		JButton btnNewButton = new JButton("Generate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				randomPassword();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(153, 214, 101, 31);
		frame.getContentPane().add(btnNewButton);

		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("@x50da");
		textPane.setBounds(93, 274, 224, 52);
		frame.getContentPane().add(textPane);

		JButton btnCopy = new JButton("Copy");
		btnCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.getText();
			}
		});
		btnCopy.setForeground(Color.WHITE);
		btnCopy.setBackground(new Color(0, 128, 255));
		btnCopy.setBounds(216, 337, 101, 31);
		frame.getContentPane().add(btnCopy);
	}

	public void randomPassword() {
		boolean includeNumbers = NumbersCheckBox.isSelected();
		boolean includeUpperCase = UpperCheckBox.isSelected();
		boolean includeLowerCase = LowerCheckBox.isSelected();
		boolean includeSymbols = SymbolCheckBox.isSelected();
		boolean includeSpace = SpaceCheckBox.isSelected();
		if (!includeLowerCase && !includeUpperCase && !includeNumbers && !includeSymbols && !includeSpace) {
			JOptionPane.showMessageDialog(frame, "Select at least one criteria");
		}
		StringBuilder passwordBuilder = new StringBuilder();
		Random random = new Random();

		String characters = "";
		if (includeNumbers) {
			characters += numbers;
		}
		if (includeUpperCase) {
			characters += Uppercase;
		}
		if (includeLowerCase) {
			characters += Lowercase;
		}
		if (includeSymbols) {
			characters += symbols;
		}
		if (includeSpace) {
			characters += space;
		}
		for (int i = 0; i < (int) spinner.getValue(); i++) {
			int rand = random.nextInt();
			char randoms = characters.charAt(rand);
			passwordBuilder.append(randoms);
		}
		String psswrd = passwordBuilder.toString();
		textPane.setText(psswrd);
		textPane.setText(characters);
	}

}
