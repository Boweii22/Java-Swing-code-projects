package MyProject;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
public class JSpinners extends JFrame {

	    public JSpinners() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 200);
	        setLayout(new FlowLayout());

	        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, 10, 1); // (initial value, minimum value, maximum value, step size)
	        JSpinner spinner = new JSpinner(spinnerModel);

	        spinner.addChangeListener(new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent e) {
	                int value = (int) spinner.getValue();
	                System.out.println("Selected value: " + value);
	            }
	        });

	        add(spinner);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new JSpinners().setVisible(true);
	            }
	        });
	    }
	}


