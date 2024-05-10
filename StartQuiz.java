package MyProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartQuiz{

	private JFrame frame;
	private JFrame frame1;
	 private JLabel questionLabel;
	    private JRadioButton option1, option2, option3, option4;
	    private JButton submitButton;
	    private ButtonGroup buttonGroup;
	    
	    private int currentQuestionIndex = 0;
	    private int score = 0;
	    
	    private String[] questions = {
	        "What is the capital of France?",
	        "What is the largest planet in our solar system?",
	        "Who painted the Mona Lisa?",
	        "Which year was the first iPhone released?"
	    };
	    
	    private String[][] options = {
	        {"Paris", "London", "Berlin", "Rome"},
	        {"Jupiter", "Saturn", "Mars", "Earth"},
	        {"Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Claude Monet"},
	        {"2007", "2008", "2006", "2005"}
	    };
	    
	    private String[] answers = {"Paris", "Jupiter", "Leonardo da Vinci", "2007"};
	    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartQuiz window = new StartQuiz();
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
	public StartQuiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(167, 121, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
