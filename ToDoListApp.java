package MyProject;
//import java.awt.BorderLayout;
//import java.awt.Container;
//import java.awt.Dimension;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.DefaultListModel;
//import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JFrame;
//import javax.swing.JList;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextField;
//import javax.swing.SwingUtilities;
//
//public class ToDoListApp extends JFrame {
//	    private DefaultListModel<String> toDoListModel;
//	    private JList<String> toDoList;
//	    private JTextField taskInput;
//	    private JButton addButton;
//	    private JButton deleteButton;
//	    private JCheckBox checkBox;
//
//	    public ToDoListApp() {
//	        setTitle("To-Do List App");
//	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	        setPreferredSize(new Dimension(300, 400));
//	        initComponents();
//	        pack();
//	        setLocationRelativeTo(null);
//	        setVisible(true);
//	    }
//
//	    private void initComponents() {
//	        Container container = getContentPane();
//	        container.setLayout(new BorderLayout());
//
//	        toDoListModel = new DefaultListModel<>();
//	        toDoList = new JList<>(toDoListModel);
//	        JScrollPane scrollPane = new JScrollPane(toDoList);
//	        container.add(scrollPane, BorderLayout.CENTER);
//
//	        taskInput = new JTextField();
//	        container.add(taskInput, BorderLayout.NORTH);
//
//	        JPanel buttonPanel = new JPanel();
//	        addButton = new JButton("Add");
//	        deleteButton = new JButton("Delete");
//	        buttonPanel.add(addButton);
//	        buttonPanel.add(deleteButton);
//	        container.add(buttonPanel, BorderLayout.SOUTH);
//
//	        addButton.addActionListener(new ActionListener() {
//	            @Override
//	            public void actionPerformed(ActionEvent e) {
//	                String task = taskInput.getText();
//	                if (!task.isEmpty()) {
//	                    toDoListModel.addElement((task));
//	                    taskInput.setText("");
//	                }
//	            }
//	        });
//
//	        deleteButton.addActionListener(new ActionListener() {
//	            @Override
//	            public void actionPerformed(ActionEvent e) {
//	                int selectedIndex = toDoList.getSelectedIndex();
//	                if (selectedIndex != -1) {
//	                    toDoListModel.remove(selectedIndex);
//	                }
//	            }
//	        });
//	    }
//
//	    public static void main(String[] args) {
//	        SwingUtilities.invokeLater(new Runnable() {
//	            @Override
//	            public void run() {
//	                new ToDoListApp();
//	            }
//	        });
//	    }
//	}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListApp extends JFrame {
    private DefaultListModel<String> listModel;
    private JList<String> taskList;
    private JTextField taskInput;
    private JButton addButton;

    public ToDoListApp() {
        setTitle("To-Do List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create the list model and task list
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Create the scroll pane for the task list
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Create the input field and add button
        taskInput = new JTextField();
        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskInput.getText().trim();
                if (!task.isEmpty()) {
                    listModel.addElement(task);
                    taskInput.setText("");
                }
            }
        });

        // Create the panel for input and button
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(taskInput, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        // Add components to the frame
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ToDoListApp().setVisible(true);
            }
        });
    }
}



