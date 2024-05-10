package MyProject;


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class FileExplorer extends JFrame {
	    private JList<String> fileList;
	    private DefaultListModel<String> listModel;

	    public FileExplorer() {
	        setTitle("File Explorer");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create the list model and list
	        listModel = new DefaultListModel<>();
	        fileList = new JList<>(listModel);

	        // Set the list to allow single selection only
	        fileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	        // Add a selection listener to the list
	        fileList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent event) {
	                if (!event.getValueIsAdjusting()) {
	                    String selectedFile = fileList.getSelectedValue();
	                    if (selectedFile != null) {
	                        File file = new File(selectedFile);
	                        if (file.isDirectory()) {
	                            updateList(file.getPath());
	                        }
	                    }
	                }
	            }
	        });

	        // Create the scroll pane and add the list to it
	        JScrollPane scrollPane = new JScrollPane(fileList);

	        // Create the root file and update the list
	        File root = new File("/");
	        updateList(root.getPath());

	        // Add the scroll pane to the frame
	        getContentPane().add(scrollPane, BorderLayout.CENTER);
	    }

	    private void updateList(String directory) {
	        listModel.clear();
	        File[] files = new File(directory).listFiles();
	        for (File file : files) {
	            listModel.addElement(file.getPath());
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new FileExplorer().setVisible(true);
	            }
	        });
	    }
	}
