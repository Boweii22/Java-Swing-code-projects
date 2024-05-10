package MyProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TicTacToeGame extends JFrame implements ActionListener {


	    private JButton[][] buttons;
	    private boolean playerX;
	    
	    
	    public TicTacToeGame() {
	        super("Tic-Tac-Toe");
	        
	        playerX = true;
	        buttons = new JButton[3][3];
	        setLayout(new GridLayout(3, 3));
	        
	        for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 3; col++) {
	                buttons[row][col] = new JButton();
	                buttons[row][col].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
	                buttons[row][col].addActionListener(this);
	                add(buttons[row][col]);
	            }
	        }
	        
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	        Icon icon = new ImageIcon("icons8-xbox-b-48.png");
	        
	    }
	    
	    public static void main(String[] args) {
	    	
	        new TicTacToeGame();
	    }
	    
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton button = (JButton) e.getSource();
	        button.setBackground(new Color(0,0,0));
	        
	        if (button.getText().equals("")) {
	            if (playerX) {
	                button.setText("X");
	                button.setForeground(new Color(255,255,255));
	            } else {
	                button.setText("O");
	                button.setForeground(new Color(62,12,94));
	            }
	            
	            playerX = !playerX;
	            
	            if (checkForWin()) {
	               JOptionPane.showMessageDialog(this, (playerX ? "O" : "X") + " wins!");
	               
	            }
	            else if (isBoardFull()) {
	                JOptionPane.showMessageDialog(this, "It's a draw!");
	            }
	        }
	    }
	    
	    private boolean checkForWin() {
	        String[][] board = new String[3][3];
	        
	        for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 3; col++) {
	                board[row][col] = buttons[row][col].getText();
	            }
	        }
	        
	        // Check rows
	        for (int row = 0; row < 3; row++) {
	            if (board[row][0].equals(board[row][1]) && board[row][0].equals(board[row][2]) && !board[row][0].equals("")) {
	                return true;
	            }
	        }
	        
	        // Check columns
	        for (int col = 0; col < 3; col++) {
	            if (board[0][col].equals(board[1][col]) && board[0][col].equals(board[2][col]) && !board[0][col].equals("")) {
	                return true;
	            }
	        }
	        
	        // Check diagonals
	        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !board[0][0].equals("")) {
	            return true;
	        }
	        if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && !board[0][2].equals("")) {
	            return true;
	        }
	        
	        return false;
	    }
	    
	    private boolean isBoardFull() {
	        for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 3; col++) {
	                if (buttons[row][col].getText().equals("")) {
	                    return false;
	                }
	            }
	        }
			return true;
//			return PlayerX

	    }
}
