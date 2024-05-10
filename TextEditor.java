package MyProject;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ChoiceFormat;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextEditor extends JFrame implements ActionListener{
	 private JTextArea textArea;
	    private JFileChooser fileChooser;
	    JFrame frame =new JFrame();
	    Frame f = new Frame();
	    private Image icon;
	    public TextEditor() {
	        setTitle("Jotter");
	        setSize(800, 600);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        icon = Toolkit.getDefaultToolkit().getImage("icons8-apps-48.png");
	        f.setIconImage(icon);
	        frame.setIconImage(icon);
	        
	        
	        // Create a JTextArea
	        textArea = new JTextArea();
	        textArea.setFont(new Font("Arial", Font.PLAIN, 14));

	        // Create a JScrollPane to hold the JTextArea
	        JScrollPane scrollPane = new JScrollPane(textArea);
	        getContentPane().add(scrollPane, BorderLayout.CENTER);

	        // Create a JMenuBar with File menu
	        JMenuBar menuBar = new JMenuBar();
	        JMenu fileMenu = new JMenu("File");
	        JMenu fileMenu1 = new JMenu("Help");
	        JMenuItem aboutMenuItem = new JMenuItem("About Jotter");
	        JMenuItem openMenuItem = new JMenuItem("Open");
	        JMenuItem saveMenuItem = new JMenuItem("Save");
	        JMenuItem exitMenuItem = new JMenuItem("Exit");
	        fileMenu.add(openMenuItem);
	        fileMenu.add(saveMenuItem);
	        fileMenu.add(exitMenuItem);
	        fileMenu1.add(aboutMenuItem);
	        menuBar.add(fileMenu);
	        menuBar.add(fileMenu1);
	        setJMenuBar(menuBar);;

	        // Add ActionListener to menu items
	        openMenuItem.addActionListener(this);
	        saveMenuItem.addActionListener(this);
	        exitMenuItem.addActionListener(this);
	        aboutMenuItem.addActionListener(this);

	        // Create a JFileChooser for file operations
	        fileChooser = new JFileChooser();

	        setVisible(true);
	        aboutMenuItem.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		JOptionPane.showMessageDialog(frame, "\r \n"
	        				+ "I am an enthusiastic, self-motivated, reliable,\n "
	        				+ "responsible and hard working person.\n"
	        				+ " I am a mature team worker and adaptable to all challenging situations. \n "
	        				+ "I am able to work well both in a team environment as well as using own initiative. \n"
	        				+ "I am able to work well under pressure and adhere to strict deadlines.");
	        	}
	        });
	    }
	   

	    public void actionPerformed(ActionEvent e) {
	    	try {
	        String command = e.getActionCommand();

	        if (command.equals("Open")) {
	            int result = fileChooser.showOpenDialog(this);
	            if (result == JFileChooser.APPROVE_OPTION) {
	                File file = fileChooser.getSelectedFile();
	                try {
	                    BufferedReader reader = new BufferedReader(new FileReader(file));
	                    textArea.read(reader, null);
	                    reader.close();
	                } catch (IOException ex) {
	                    ex.printStackTrace();
	                }
	            }
	        } else if (command.equals("Save")) {
	            int result = fileChooser.showSaveDialog(this);
	            if (result == JFileChooser.APPROVE_OPTION) {
	                File file = fileChooser.getSelectedFile();
	                try {
	                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	                    textArea.write(writer);
	                    writer.close();
	                } catch (IOException ex) {
	                    ex.printStackTrace();
	                }
	            }
	        } else if (command.equals("Exit")) {
	        	int result = fileChooser.showSaveDialog(this);
	            if (result == JFileChooser.APPROVE_OPTION) {
	                File file = fileChooser.getSelectedFile();
	                try {
	                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	                    textArea.write(writer);
	                    writer.close();
	                } catch (IOException ex) {
	                    ex.printStackTrace();
	                }
	            }
	            System.exit(0);
	        }
	 
	    	}catch(Exception exe) {
	    		
	    	}
	    }
}