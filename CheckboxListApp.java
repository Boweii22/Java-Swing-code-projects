package MyProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckboxListApp extends JFrame {
	    private DefaultListModel<JCheckBox> checkboxListModel;
	    private JList<JCheckBox> checkboxList;
	    private JTextField checkboxInput;
	    private JButton addButton;

	    public CheckboxListApp() {
	        setTitle("Checkbox List App");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setPreferredSize(new Dimension(300, 400));
	        initComponents();
	        pack();
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    private void initComponents() {
	        Container container = getContentPane();
	        container.setLayout(new BorderLayout());

	        checkboxListModel = new DefaultListModel<>();
	        checkboxList = new JList<>(checkboxListModel);
	        checkboxList.setCellRenderer(new CheckboxCellRenderer());
	        JScrollPane scrollPane = new JScrollPane(checkboxList);
	        container.add(scrollPane, BorderLayout.CENTER);

	        checkboxInput = new JTextField();
	        container.add(checkboxInput, BorderLayout.NORTH);

	        JPanel buttonPanel = new JPanel();
	        addButton = new JButton("Add");
	        buttonPanel.add(addButton);
	        container.add(buttonPanel, BorderLayout.SOUTH);

	        addButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String text = checkboxInput.getText();
	                if (!text.isEmpty()) {
	                    JCheckBox checkbox = new JCheckBox(text);
	                    checkboxListModel.addElement(checkbox);
	                    checkboxInput.setText("");
	                }
	            }
	        });
	    }

	    private class CheckboxCellRenderer extends JCheckBox implements ListCellRenderer<JCheckBox> {
	        @Override
	        public Component getListCellRendererComponent(JList<? extends JCheckBox> list, JCheckBox value, int index,
	                                                      boolean isSelected, boolean cellHasFocus) {
	            setSelected(value.isSelected());
	            setText(value.getText());
	            setBackground(list.getBackground());
	            setForeground(list.getForeground());
	            setFont(list.getFont());
	            setEnabled(list.isEnabled());
	            setFocusPainted(false);
	            return this;
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new CheckboxListApp();
	            }
	        });
	    }
	}
