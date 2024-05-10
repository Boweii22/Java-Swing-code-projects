package MyProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class car extends JFrame implements ActionListener, KeyListener {
	private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int CAR_WIDTH = 60;
    private static final int CAR_HEIGHT = 100;
    private static final int ROAD_WIDTH = 400;
    private static final int ROAD_HEIGHT = HEIGHT;
    private static final int ROAD_X = (WIDTH - ROAD_WIDTH) / 2;
    private static final int ROAD_Y = 0;
    private static final int CAR_SPEED = 5;

    private JPanel gamePanel;
    private Timer timer;
    private int carX, carY;
    private boolean leftKeyPressed, rightKeyPressed;

    public car() {
        setTitle("Car Race Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        gamePanel = new JPanel();
        gamePanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        gamePanel.setBackground(Color.GRAY);
        gamePanel.setFocusable(true);
        gamePanel.addKeyListener(this);
        add(gamePanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        initGame();
    }

    private void initGame() {
        carX = (WIDTH - CAR_WIDTH) / 2;
        carY = HEIGHT - CAR_HEIGHT;

//        timer = new Timer(10, this);
//        timer.start();
    }

    private void updateGame() {
        // Move car
        if (leftKeyPressed && carX > ROAD_X) {
            carX -= CAR_SPEED;
        }
        if (rightKeyPressed && carX < ROAD_X + ROAD_WIDTH - CAR_WIDTH) {
            carX += CAR_SPEED;
        }

        // Repaint game panel
        gamePanel.repaint();
    }

    private void drawGame(Graphics g) {
        // Draw road
        g.setColor(Color.BLACK);
        g.fillRect(ROAD_X, ROAD_Y, ROAD_WIDTH, ROAD_HEIGHT);

        // Draw car
        g.setColor(Color.BLUE);
        g.fillRect(carX, carY, CAR_WIDTH, CAR_HEIGHT);
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
