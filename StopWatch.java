package MyProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StopWatch {

	private JFrame frame;
	double seconds = 00;
	double tens = 00;
	double minutes = 00;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StopWatch window = new StopWatch();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StopWatch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel minsLabel = new JLabel("00");
		minsLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		minsLabel.setBounds(75, 83, 66, 48);
		frame.getContentPane().add(minsLabel);
		
		JLabel secondsLabel = new JLabel("00");
		secondsLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		secondsLabel.setBounds(195, 83, 72, 48);
		frame.getContentPane().add(secondsLabel);
		
		JLabel tensLabel = new JLabel("00");
		tensLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		tensLabel.setBounds(315, 83, 75, 48);
		frame.getContentPane().add(tensLabel);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tens++;
				if(tens>9) {
					tensLabel.setText(tens + "");
				}
				if(tens>99) {
					seconds++;
					secondsLabel.setText("0" + seconds);
					tens = 0;
					tensLabel.setText(seconds + "");
				}
				if(seconds>9) {
					secondsLabel.setText(seconds + "");
				}
				if(seconds<60) {
					minutes++;
					minsLabel.setText("0" + minutes);
					seconds = 0;
					secondsLabel.setText(minutes + "");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(52, 200, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnStop.setBounds(178, 200, 89, 23);
		frame.getContentPane().add(btnStop);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBounds(301, 200, 89, 23);
		frame.getContentPane().add(btnReset);
	}

}
