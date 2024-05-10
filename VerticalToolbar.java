package MyProject;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.UIManager;

public class VerticalToolbar extends JFrame {
		public VerticalToolbar() {
//			setBackground(new Color(0,0,0));
//			setForeground(new Color(255,255,255));
			setTitle("VerticalToolbar");
			JToolBar toolbar = new JToolBar(JToolBar.VERTICAL);
			
			JButton focus = new JButton("Focus Sessions");
			JButton timer = new JButton("Timer");
			JButton alarm = new JButton("Alarm");
			JButton stopwatch = new JButton("Stopwatch");
			JButton worldclock = new JButton("WorldClock");
			
			toolbar.add(focus);
			toolbar.add(timer);
			toolbar.add(alarm);
			toolbar.add(stopwatch);
			toolbar.add(worldclock);

			add(toolbar, BorderLayout.WEST);
			 setSize(250, 350);
			 setLocationRelativeTo(null);
			 setDefaultCloseOperation(EXIT_ON_CLOSE);
			 setVisible(true);
		}
		public static void main(String[] args) {
			try {
				 UIManager.setLookAndFeel(
				 UIManager.getSystemLookAndFeelClassName());
				 } 
				 catch (Exception e) {
				 System.out.println("Error:" + e.getStackTrace());
				 }
				 new VerticalToolbar();
		}
}
