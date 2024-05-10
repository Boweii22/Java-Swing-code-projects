package MyProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DropdownExample extends JFrame {
	
	
	    private JComboBox<String> dropdown;

	    public DropdownExample() {
	        setTitle("Dropdown Example");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setPreferredSize(new Dimension(300, 200));
	        initComponents();
	        pack();
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    private void initComponents() {
	        Container container = getContentPane();
	        container.setLayout(new FlowLayout());

	        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4"};

	        dropdown = new JComboBox<>(options);
	        container.add(dropdown);

	        JButton selectButton = new JButton("Select");
	        container.add(selectButton);

	        selectButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String selectedOption = (String) dropdown.getSelectedItem();
	                JOptionPane.showMessageDialog(DropdownExample.this, "Selected option: " + selectedOption);
	            }
	        });
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new DropdownExample();
	            }
	        });
	    }
	}
