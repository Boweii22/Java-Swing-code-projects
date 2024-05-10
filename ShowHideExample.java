package MyProject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ShowHideExample extends JFrame {
	    private JButton button;
	    private JLabel label;

	    public ShowHideExample() {
	        super("Show/Hide Example");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Create the button
	        button = new JButton("Toggle Label");
	        button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Toggle the label's visibility
	                label.setVisible(!label.isVisible());
	            }
	        });

	        // Create the label
	        label = new JLabel("Hello, World!");
	        label.setVisible(false); // Initially hide the label

	        // Add the components to the frame
	        add(button);
	        add(label);

	        // Set the frame size and make it visible
	        setSize(200, 100);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new ShowHideExample();
	            }
	        });
	    }
	}