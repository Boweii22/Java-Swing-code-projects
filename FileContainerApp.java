package MyProject;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FileContainerApp extends JFrame {

	    public FileContainerApp() {
	        setTitle("File Container");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(500, 300);
	        setLocationRelativeTo(null);

	        JButton openContainerButton = new JButton("Open Container");
	        openContainerButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                openFileContainer();
	            }
	        });

	        JPanel panel = new JPanel();
	        panel.add(openContainerButton);
	        add(panel, BorderLayout.CENTER);

	        setVisible(true);
	    }

	    private void openFileContainer() {
	        JFileChooser fileChooser = new JFileChooser();
	        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

	        int result = fileChooser.showOpenDialog(FileContainerApp.this);
	        if (result == JFileChooser.APPROVE_OPTION) {
	            String containerPath = fileChooser.getSelectedFile().getAbsolutePath();

	            // Perform operations with the selected file container path
	            // Here, you can add further functionality to handle files, pictures, music, etc.
	            System.out.println("Selected File Container: " + containerPath);
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new FileContainerApp();
	            }
	        });
	    }
	}