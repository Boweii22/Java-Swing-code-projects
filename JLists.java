package MyProject;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

public class JLists extends JFrame {
	    private JList<String> itemList;
	    private DefaultListModel<String> listModel;

	    public JLists() {
	        setTitle("JList with Checkboxes Example");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Create the list model and populate it with items
	        listModel = new DefaultListModel<>();
	        listModel.addElement("Item 1");
	        listModel.addElement("Item 2");
	        listModel.addElement("Item 3");
	        listModel.addElement("Item 4");
	        listModel.addElement("Item 5");

	        // Create the JList with the list model
	        itemList = new JList<>(listModel);
	        itemList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Wrap the JList in a JScrollPane for scrolling
	        JScrollPane scrollPane = new JScrollPane(itemList);
	        scrollPane.setPreferredSize(new Dimension(150, 150));
	        add(scrollPane);

	        // Create a button to display the selected items
	        JButton button = new JButton("Show Selected Items");
	        button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Get the selected items from the JList
	                Object[] selectedItems = itemList.getSelectedValues();

	                // Display the selected items in a message dialog
	                JOptionPane.showMessageDialog(
	                        JLists.this,
	                        "Selected items: " + String.join(", ", (CharSequence[]) selectedItems),
	                        "Selected Items",
	                        JOptionPane.INFORMATION_MESSAGE
	                );
	            }
	        });
	        add(button);

	        pack();
	        setLocationRelativeTo(null);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new JLists().setVisible(true);
	            }
	        });
	    }
	}

