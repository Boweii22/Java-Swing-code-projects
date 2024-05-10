package MyProject;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class QuizGame extends JFrame {
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
	    
	    public QuizGame() {
	        setTitle("Quiz Game");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        setLayout(new GridLayout(6, 1));
	        
	        questionLabel = new JLabel();
	        add(questionLabel);
	        
	        option1 = new JRadioButton();
	        option2 = new JRadioButton();
	        option3 = new JRadioButton();
	        option4 = new JRadioButton();
	        
	        buttonGroup = new ButtonGroup();
	        buttonGroup.add(option1);
	        buttonGroup.add(option2);
	        buttonGroup.add(option3);
	        buttonGroup.add(option4);
	        
	        add(option1);
	        add(option2);
	        add(option3);
	        add(option4);
	        
	        submitButton = new JButton("Submit");
	        add(submitButton);
	        
	        submitButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String selectedAnswer = "";
	                if (option1.isSelected()) {
	                    selectedAnswer = option1.getText();
	                } else if (option2.isSelected()) {
	                    selectedAnswer = option2.getText();
	                } else if (option3.isSelected()) {
	                    selectedAnswer = option3.getText();
	                } else if (option4.isSelected()) {
	                    selectedAnswer = option4.getText();
	                }
	                
	                if (selectedAnswer.equals(answers[currentQuestionIndex])) {
	                    score++;
	                }
	                
	                currentQuestionIndex++;
	                if (currentQuestionIndex < questions.length) {
	                    displayQuestion();
	                } else {
	                    showResult();
	                }
	            }
	        });
	        
	        displayQuestion();
	    }
	    
	    private void displayQuestion() {
	        questionLabel.setText(questions[currentQuestionIndex]);
	        option1.setText(options[currentQuestionIndex][0]);
	        option2.setText(options[currentQuestionIndex][1]);
	        option3.setText(options[currentQuestionIndex][2]);
	        option4.setText(options[currentQuestionIndex][3]);
	        
	        buttonGroup.clearSelection();
	    }
	    
	    private void showResult() {
	        String result = "Quiz Finished!\n";
	        result += "Your Score: " + score + " / " + questions.length;
	        JOptionPane.showMessageDialog(this, result);
	        System.exit(0);
	    }
	    
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new QuizGame().setVisible(true);
	            }
	        });
	    }
	}
