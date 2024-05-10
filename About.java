package MyProject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class About extends JFrame {
	public About(){
        setTitle("About");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen

        JLabel aboutLabel = new JLabel("This is the About window.");
        aboutLabel.setHorizontalAlignment(SwingConstants.CENTER);

//        JButton closeButton = new JButton("Close");
//        closeButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                dispose(); // Close the About window
//            }
//        });

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(aboutLabel, BorderLayout.CENTER);

        setContentPane(contentPane);
    }
}
