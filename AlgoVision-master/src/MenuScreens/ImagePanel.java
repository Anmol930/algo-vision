package MenuScreens;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;

public class ImagePanel extends JPanel {

    private Image backgroundImage;

    // Constructor that takes an image file path
    public ImagePanel(String imagePath) {
        try {
            // Load the image
            backgroundImage = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background image if it's loaded
        if (backgroundImage != null) {
            // Scale the image to fit the panel
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image as Background Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create an instance of the ImagePanel with the path to the image file
        ImagePanel imagePanel = new ImagePanel("Vital-Functions-of-DSA-Loan-Agents-3.jpg");

        // Add the panel to the frame
        frame.add(imagePanel);

        frame.setVisible(true);
    }
}
