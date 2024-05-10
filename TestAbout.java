package MyProject;

import javax.swing.SwingUtilities;

public class TestAbout {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                About aboutWindow = new About();
                aboutWindow.setVisible(true);
            }
        });
    }
		

	}

