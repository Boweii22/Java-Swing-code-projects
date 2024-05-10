package MyProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Quiza extends JFrame {
	    private JLabel questionLabel;
	    private JRadioButton option1;
	    private JRadioButton option2;
	    private JRadioButton option3;
	    private JRadioButton option4;
	    private JButton nextButton;
	    private int currentQuestionIndex;

	    private String[][] quizData = {
	            {"Question 1: What is the capital of France?", "Paris", "London", "Berlin", "Rome"},
	            {"Question 2: Which planet is known as the Red Planet?", "Mars", "Venus", "Jupiter", "Mercury"},
	            {"Question 3: Who painted the Mona Lisa?", "Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Claude Monet"}
	    };

	    public Quiza() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setTitle("Quiz App");
	        setLayout(new FlowLayout());

	        questionLabel = new JLabel();
	        option1 = new JRadioButton();
	        option2 = new JRadioButton();
	        option3 = new JRadioButton();
	        option4 = new JRadioButton();
	        nextButton = new JButton("Next");

	        ButtonGroup buttonGroup = new ButtonGroup();
	        buttonGroup.add(option1);
	        buttonGroup.add(option2);
	        buttonGroup.add(option3);
	        buttonGroup.add(option4);

	        nextButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (currentQuestionIndex < quizData.length - 1) {
	                    currentQuestionIndex++;
	                    loadQuestion(currentQuestionIndex);
	                } else {
	                    showResult();
	                }
	            }
	        });

	        add(questionLabel);
	        add(option1);
	        add(option2);
	        add(option3);
	        add(option4);
	        add(nextButton);

	        currentQuestionIndex = 0;
	        loadQuestion(currentQuestionIndex);
	    }

	    private void loadQuestion(int index) {
	        String[] questionData = quizData[index];
	        questionLabel.setText(questionData[0]);
	        option1.setText(questionData[1]);
	        option2.setText(questionData[2]);
	        option3.setText(questionData[3]);
	        option4.setText(questionData[4]);

	        clearSelection();
	    }

	    private void clearSelection() {
	        option1.setSelected(false);
	        option2.setSelected(false);
	        option3.setSelected(false);
	        option4.setSelected(false);
	    }

	    private void showResult() {
	        int correctAnswers = 0;
	        for (int i = 0; i < quizData.length; i++) {
	            if (getSelectedOption(i).equals(quizData[i][1])) {
	                correctAnswers++;
	            }
	        }
	        double percentage = (double) correctAnswers / quizData.length * 100;

	        JOptionPane.showMessageDialog(this, "Quiz completed!\nCorrect answers: " + correctAnswers +
	                "\nPercentage: " + percentage + "%", "Quiz Result", JOptionPane.INFORMATION_MESSAGE);

	        System.exit(0);
	    }

	    private String getSelectedOption(int index) {
	        if (option1.isSelected()) {
	            return quizData[index][1];
	        } else if (option2.isSelected()) {
	            return quizData[index][2];
	        } else if (option3.isSelected()) {
	            return quizData[index][3];
	        } else if (option4.isSelected()) {
	            return quizData[index][4];
	        } else {
	            return "";
	        }
	    }
}
//	class runQuiz{
//		public static void main(String[] args) {
//			SwingUtilities.invokeLater(new Runnable() {
//
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					Quiza quiz = new Quiza();
//					
//				}
//				
//			});
//		}
//	}
