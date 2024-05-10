package MyProject;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TaskManagerApp extends JFrame {
	
	
	    private List<Task> taskList;
	    private DefaultTableModel tableModel;
	    private JTable taskTable;

	    public TaskManagerApp() {
	        taskList = new ArrayList<>();

	        setTitle("Task Manager");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(500, 300);
	        setLocationRelativeTo(null);

	        createMenuBar();

	        tableModel = new DefaultTableModel(new Object[]{"Task", "Description", "Due Date", "Status"}, 0);
	        taskTable = new JTable(tableModel);
	        JScrollPane scrollPane = new JScrollPane(taskTable);
	        add(scrollPane, BorderLayout.CENTER);

	        setVisible(true);
	    }

	    private void createMenuBar() {
	        JMenuBar menuBar = new JMenuBar();
	        JMenu fileMenu = new JMenu("File");
	        JMenuItem addTaskItem = new JMenuItem("Add Task");
	        JMenuItem editTaskItem = new JMenuItem("Edit Task");
	        JMenuItem exitItem = new JMenuItem("Exit");

	        addTaskItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                addTask();
	            }
	        });

	        editTaskItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int selectedRow = taskTable.getSelectedRow();
	                if (selectedRow != -1) {
	                    editTask(selectedRow);
	                } else {
	                    JOptionPane.showMessageDialog(TaskManagerApp.this, "Please select a task to edit.");
	                }
	            }
	        });

	        exitItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });

	        fileMenu.add(addTaskItem);
	        fileMenu.add(editTaskItem);
	        fileMenu.addSeparator();
	        fileMenu.add(exitItem);

	        menuBar.add(fileMenu);
	        setJMenuBar(menuBar);
	    }

	    private void addTask() {
	        JTextField taskField = new JTextField();
	        JTextField descriptionField = new JTextField();
	        JTextField dueDateField = new JTextField();

	        JPanel panel = new JPanel(new GridLayout(0, 1));
	        panel.add(new JLabel("Task:"));
	        panel.add(taskField);
	        panel.add(new JLabel("Description:"));
	        panel.add(descriptionField);
	        panel.add(new JLabel("Due Date:"));
	        panel.add(dueDateField);

	        int result = JOptionPane.showConfirmDialog(null, panel, "Add Task", JOptionPane.OK_CANCEL_OPTION);
	        if (result == JOptionPane.OK_OPTION) {
	            String task = taskField.getText();
	            String description = descriptionField.getText();
	            String dueDate = dueDateField.getText();

	            taskList.add(new Task(task, description, dueDate, "Pending"));
	            tableModel.addRow(new Object[]{task, description, dueDate, "Pending"});
	        }
	    }

	    private void editTask(int rowIndex) {
	        JTextField taskField = new JTextField(taskList.get(rowIndex).getTask());
	        JTextField descriptionField = new JTextField(taskList.get(rowIndex).getDescription());
	        JTextField dueDateField = new JTextField(taskList.get(rowIndex).getDueDate());

	        JPanel panel = new JPanel(new GridLayout(0, 1));
	        panel.add(new JLabel("Task:"));
	        panel.add(taskField);
	        panel.add(new JLabel("Description:"));
	        panel.add(descriptionField);
	        panel.add(new JLabel("Due Date:"));
	        panel.add(dueDateField);

	        int result = JOptionPane.showConfirmDialog(null, panel, "Edit Task", JOptionPane.OK_CANCEL_OPTION);
	        if (result == JOptionPane.OK_OPTION) {
	            String task = taskField.getText();
	            String description = descriptionField.getText();
	            String dueDate = dueDateField.getText();

	            taskList.get(rowIndex).setTask(task);
	            taskList.get(rowIndex).setDescription(description);
	            taskList.get(rowIndex).setDueDate(dueDate);

	            tableModel.setValueAt(task, rowIndex, 0);
	            tableModel.setValueAt(description, rowIndex, 1);
	            tableModel.setValueAt(dueDate, rowIndex, 2);
	        }
	    }

	    private class Task {
	        private String task;
	        private String description;
	        private String dueDate;
	        private String status;

	        public Task(String task, String description, String dueDate, String status) {
	            this.task = task;
	            this.description = description;
	            this.dueDate = dueDate;
	            this.status = status;
	        }

	        public String getTask() {
	            return task;
	        }

	        public void setTask(String task) {
	            this.task = task;
	        }

	        public String getDescription() {
	            return description;
	        }

	        public void setDescription(String description) {
	            this.description = description;
	        }

	        public String getDueDate() {
	            return dueDate;
	        }

	        public void setDueDate(String dueDate) {
	            this.dueDate = dueDate;
	        }

	        public String getStatus() {
	            return status;
	        }

	        public void setStatus(String status) {
	            this.status = status;
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new TaskManagerApp();
	            }
	        });
	    }
	}
