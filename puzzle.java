package MyProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.util.Random;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class puzzle extends JFrame implements ActionListener {
	private JPanel centerPanel;
	private JButton button;
	private JLabel label;
	private Image source;
	private Image image;
	private ImageIcon icon;
	int[][] pos;
	int width, height;

	public puzzle() {
		 pos = new int[][] {
			 {0, 1, 2}, 
			 {3, 4, 5}, 
			 {6, 7, 8}, 
			 {9, 10, 11}
			 };
			 
			 centerPanel = new JPanel();
			 centerPanel.setLayout(new GridLayout(4, 4, 0, 0));
//			 ImageIcon sid = new 
//			ImageIcon(Puzzle.class.getResource("images (2).jpg"));
//			 source = sid.getImage();
//			 width = sid.getIconWidth();
//			 height = sid.getIconHeight();
			 add(Box.createRigidArea(new Dimension(0, 5)),BorderLayout.NORTH);
			 add(centerPanel, BorderLayout.CENTER);
			 
			 for(int i =0;i<4;i++) {
				 for(int j=0;j<3;j++) {
					 if(j==2 && i==3) {
						 label = new JLabel("");
						 centerPanel.add(label);
					 }else {
						 button = new JButton();
						 button.addActionListener(this);
						 centerPanel.add(button);
//						 image = createImage(new 
//								 FilteredImageSource(source.getSource(), new CropImageFilter(j*width/3, i*height/4, 
//										 (width/3)+1, height/4)));
						 icon = new ImageIcon("images (2).jpg");
						 width = icon.getIconWidth() /3;
						 height = icon.getIconHeight() / 4;
						 image = createImage(new FilteredImageSource(icon.getImage().getSource(), new CropImageFilter(j*width,j*height,
								 (width)+1,height)));
						 button.setText(i + "");
					 }
				 }
			 }
			 setSize(325, 275);
			 setTitle("Puzzle");
			 setResizable(false);
			 setLocationRelativeTo(null);
			 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			 setVisible(true);

			 
	 }
	public static void main(String[] args) {
		new puzzle();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		Dimension size = button.getSize();
		 int labelX = label.getX();
		 int labelY = label.getY();
		 int buttonX = button.getX();
		 int buttonY = button.getY();
		 int buttonPosX = buttonX / size.width;
		 int buttonPosY = buttonY / size.height;
		 int buttonIndex = pos[buttonPosY][buttonPosX];
		 
		 if (labelX == buttonX && (labelY - buttonY) == size.height ) {
			 int labelIndex = buttonIndex + 3;
			 centerPanel.remove(buttonIndex);
			 centerPanel.add(label, buttonIndex);
			 centerPanel.add(button,labelIndex);
			 centerPanel.validate();
		 }
		 if (labelX == buttonX && (labelY - buttonY) == -size.height ) {
			 int labelIndex = buttonIndex - 3;
			 centerPanel.remove(labelIndex);
			 centerPanel.add(button,labelIndex);
			 centerPanel.add(label, buttonIndex);
			 centerPanel.validate();
		 }
		 if (labelY == buttonY && (labelX - buttonX) == size.width ) {
			 int labelIndex = buttonIndex + 1;
			 centerPanel.remove(buttonIndex);
			 centerPanel.add(label, buttonIndex);
			 centerPanel.add(button,labelIndex);
			 centerPanel.validate();
		 }
		 if (labelY == buttonY && (labelX - buttonX) == -size.width ) {
			 int labelIndex = buttonIndex - 1;
			 centerPanel.remove(buttonIndex);
			 centerPanel.add(label, labelIndex);
			 centerPanel.add(button,labelIndex);
			 centerPanel.validate();
			 }
		
	}
}
