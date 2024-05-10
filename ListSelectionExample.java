package MyProject;

import java.awt.Dimension;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListSelectionExample extends JFrame {
	    private JList<String> itemList;
	    private DefaultListModel<String> listModel;

	    public ListSelectionExample() {
	        setTitle("List Selection Example");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create the list model and populate it with items
	        listModel = new DefaultListModel<>();
	        listModel.addElement("Item 1");
	        listModel.addElement("Item 2");
	        listModel.addElement("Item 3");
	        listModel.addElement("Item 4");
	        listModel.addElement("Item 5");

	        // Create the JList with the list model
	        itemList = new JList<>(listModel);

	        // Create a selection listener for the JList
	        itemList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                // Check if the selection event is complete
	                if (!e.getValueIsAdjusting()) {
	                    // Get the selected item from the JList
	                    String selectedItem = itemList.getSelectedValue();
	                    
	                    // Perform the desired action with the selected item
	                    System.out.println("Selected item: " + selectedItem);
	                }
	            }
	        });

	        // Wrap the JList in a JScrollPane for scrolling
	        JScrollPane scrollPane = new JScrollPane(itemList);
	        scrollPane.setPreferredSize(new Dimension(150, 150));
	        add(scrollPane);

	        pack();
	        setLocationRelativeTo(null);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new ListSelectionExample().setVisible(true);
	            }
	        });
	    }
	}


