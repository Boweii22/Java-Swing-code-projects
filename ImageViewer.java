package MyProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
public class ImageViewer extends JFrame {
	    private JLabel imageLabel;
	    private JButton prevButton;
	    private JButton nextButton;
	    private JFileChooser fileChooser;
	    private File[] imageFiles;
	    private int currentImageIndex;

	    public ImageViewer() {
	        setTitle("Image Viewer");
	        setSize(600, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        imageLabel = new JLabel();
	        imageLabel.setHorizontalAlignment(JLabel.CENTER);
	        add(imageLabel, BorderLayout.CENTER);

	        prevButton = new JButton("Previous");
	        nextButton = new JButton("Next");

	        prevButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                showPreviousImage();
	            }
	        });

	        nextButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                showNextImage();
	            }
	        });

	        JPanel buttonPanel = new JPanel();
	        buttonPanel.add(prevButton);
	        buttonPanel.add(nextButton);
	        add(buttonPanel, BorderLayout.SOUTH);

	        fileChooser = new JFileChooser();
	        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	        fileChooser.setMultiSelectionEnabled(true);

	        JMenuBar menuBar = new JMenuBar();
	        JMenu fileMenu = new JMenu("File");
	        JMenuItem openMenuItem = new JMenuItem("Open");
	        openMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                openImages();
	            }
	        });
	        fileMenu.add(openMenuItem);
	        menuBar.add(fileMenu);
	        setJMenuBar(menuBar);
	    }

	    private void openImages() {
	        int returnValue = fileChooser.showOpenDialog(this);
	        if (returnValue == JFileChooser.APPROVE_OPTION) {
	            imageFiles = fileChooser.getSelectedFiles();
	            currentImageIndex = 0;
	            displayImage();
	        }
	    }

	    private void displayImage() {
	        try {
	            File currentImageFile = imageFiles[currentImageIndex];
	            Image image = ImageIO.read(currentImageFile);
	            ImageIcon imageIcon = new ImageIcon(image);
	            imageLabel.setIcon(imageIcon);
	        } catch (Exception ex) {
	            JOptionPane.showMessageDialog(this, "Error displaying image: " + ex.getMessage());
	        }
	    }

	    private void showPreviousImage() {
	        if (currentImageIndex > 0) {
	            currentImageIndex--;
	            displayImage();
	        }
	    }

	    private void showNextImage() {
	        if (currentImageIndex < imageFiles.length - 1) {
	            currentImageIndex++;
	            displayImage();
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new ImageViewer().setVisible(true);
	            }
	        });
	    }
	}
