package MyProject;

import javax.swing.SwingUtilities;

public class Disaster1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Disaster app = new Disaster();
                app.setVisible(true);
            }
        });

	}

}
