package MyProject;

	import javax.swing.*;
	import java.awt.*;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	public class DigitalClock extends JFrame {
	    private JLabel timeLabel;

	    public DigitalClock() {
	        setTitle("Digital Clock");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 100);
	        setResizable(false);
	        setLocationRelativeTo(null);

	        timeLabel = new JLabel();
	        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
	        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        updateTime();

	        add(timeLabel);

	        Timer timer = new Timer(1000, e -> updateTime());
	        timer.start();
	    }

	    private void updateTime() {
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	        Date date = new Date();
	        String time = sdf.format(date);
	        timeLabel.setText(time);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            DigitalClock clockApp = new DigitalClock();
	            clockApp.setVisible(true);
	        });
	    }
	}
