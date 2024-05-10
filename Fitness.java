package MyProject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fitness extends JFrame{

	private JLabel stepsLabel;
    private JButton incrementButton;
    private int stepsCount;

    public Fitness() {
        setTitle("Fitness Tracker");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        stepsCount = 0;

        stepsLabel = new JLabel("Steps: " + stepsCount);
        add(stepsLabel);

        incrementButton = new JButton("Increment Steps");
        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stepsCount++;
                stepsLabel.setText("Steps: " + stepsCount);
            }
        });
        add(incrementButton);
}
}
