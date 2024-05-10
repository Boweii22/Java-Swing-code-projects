package MyProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class RandomPassword extends JFrame {


	    private JLabel lengthLabel;
	    private JTextField lengthTextField;
	    private JCheckBox lowercaseCheckBox;
	    private JCheckBox uppercaseCheckBox;
	    private JCheckBox numbersCheckBox;
	    private JButton generateButton;
	    private JTextArea passwordTextArea;

	    public RandomPassword() {
	        setTitle("Random Password Generator");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 300);
	        setLayout(new FlowLayout());

	        lengthLabel = new JLabel("Password Length:");
	        lengthTextField = new JTextField(10);

	        lowercaseCheckBox = new JCheckBox("Lowercase Letters");
	        uppercaseCheckBox = new JCheckBox("Uppercase Letters");
	        numbersCheckBox = new JCheckBox("Numbers");

	        generateButton = new JButton("Generate");
	        generateButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                generatePassword();
	            }
	        });

	        passwordTextArea = new JTextArea(8, 30);
	        passwordTextArea.setEditable(false);

	        add(lengthLabel);
	        add(lengthTextField);
	        add(lowercaseCheckBox);
	        add(uppercaseCheckBox);
	        add(numbersCheckBox);
	        add(generateButton);
	        add(new JScrollPane(passwordTextArea));
	    }

	    private void generatePassword() {
	        int length = Integer.parseInt(lengthTextField.getText());

	        boolean includeLowercase = lowercaseCheckBox.isSelected();
	        boolean includeUppercase = uppercaseCheckBox.isSelected();
	        boolean includeNumbers = numbersCheckBox.isSelected();

	        if (!includeLowercase && !includeUppercase && !includeNumbers) {
	            JOptionPane.showMessageDialog(this, "Please select at least one character type.", "Invalid Configuration", JOptionPane.WARNING_MESSAGE);
	            return;
	        }

	        StringBuilder passwordBuilder = new StringBuilder();
	        Random random = new Random();

	        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
	        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String numbers = "0123456789";

	        String characters = "";
	        if (includeLowercase) {
	            characters += lowercaseLetters;
	        }
	        if (includeUppercase) {
	            characters += uppercaseLetters;
	        }
	        if (includeNumbers) {
	            characters += numbers;
	        }

	        for (int i = 0; i < length; i++) {
	            int randomIndex = random.nextInt(characters.length());
	            char randomChar = characters.charAt(randomIndex);
	            passwordBuilder.append(randomChar);
	        }

	        String password = passwordBuilder.toString();
	        passwordTextArea.setText(password);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                RandomPassword generator = new RandomPassword();
	                generator.setVisible(true);
	            }
	        });
	    }
	}


