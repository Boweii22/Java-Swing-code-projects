package MyProject;

import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

public class CheckboxListExample extends JFrame {

	    private DefaultListModel<JCheckBox> listModel;
	    private JList<JCheckBox> checkBoxList;

	    public CheckboxListExample() {
	        setTitle("Checkbox List Example");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 200);

	        // Create the list model
	        listModel = new DefaultListModel<>();

	        // Create the JList using the list model
	        checkBoxList = new JList<>(listModel);
	        checkBoxList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Create a JScrollPane to contain the JList
	        JScrollPane scrollPane = new JScrollPane(checkBoxList);

	        // Add the JScrollPane to the frame
	        add(scrollPane);

	        // Add some checkboxes to the list
	        listModel.addElement(new JCheckBox("Checkbox 1"));
	        listModel.addElement(new JCheckBox("Checkbox 2"));

	        // Display the frame
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            new CheckboxListExample();
	        });
	    }
	}

