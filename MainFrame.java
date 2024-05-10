package MyProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainFrame extends JFrame {
	    public MainFrame() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setTitle("Main Frame");

	        JButton nextButton = new JButton("Next");
	        nextButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                NewFrame newFrame = new NewFrame();
	                newFrame.setVisible(true);
	            }
	        });

	        getContentPane().setLayout(new FlowLayout());
	        getContentPane().add(nextButton);

	        pack();
	        setLocationRelativeTo(null);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                MainFrame mainFrame = new MainFrame();
	                mainFrame.setVisible(true);
	            }
	        });
	    }
	}

	class NewFrame extends JFrame {
	    public NewFrame() {
	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        setTitle("New Frame");

	        JLabel label = new JLabel("This is a new frame.");
	        getContentPane().add(label);

	        pack();
	        setLocationRelativeTo(null);
	    }
	}
