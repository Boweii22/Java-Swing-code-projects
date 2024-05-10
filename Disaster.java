package MyProject;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Disaster extends JFrame{
	
	public Disaster() {
	 setTitle("Disaster Preparedness App");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(400, 300);
     setLocationRelativeTo(null);

     // Create components
     JLabel disasterLabel = new JLabel("Select a Disaster:");
     JComboBox<String> disasterComboBox = new JComboBox<>(new String[]{"Earthquake", "Flood", "Hurricane"});
     JButton prepareButton = new JButton("Prepare");

     // Add components to the content pane
     Container container = getContentPane();
     container.setLayout(new GridLayout(3, 1));
     container.add(disasterLabel);
     container.add(disasterComboBox);
     container.add(prepareButton);

     // Add action listener to the prepareButton
     prepareButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             String selectedDisaster = (String) disasterComboBox.getSelectedItem();
             JOptionPane.showMessageDialog(null, "Preparing for " + selectedDisaster + "...");
             // Perform actions based on the selected disaster
             // You can add logic here to open relevant resources or provide safety tips
         }
     });
}
}
