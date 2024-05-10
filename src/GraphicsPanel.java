import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GraphicsPanel extends JPanel {
    private double stringX;
    private double starY;
    private BufferedImage image;
    public GraphicsPanel () {
        stringX = 300;
        starY = 350;
        try {
            image = ImageIO.read(new File("src/download.jpg"));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        stringX -= 0.2;
        if (stringX < 50) {
            stringX = 300;
        }
        starY += 0.4;
        if (starY > 500) {
            starY = 0;
        }
        g.setColor(Color.RED);
        g.drawOval(20, 30, 100, 300);
        g.setColor(Color.BLUE);
        g.fillOval(25, 30, 90, 300);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Times new Roman", Font.ITALIC, 24));
        g.drawString("Bob the builder, can we build it!",50, (int)starY);
        g.drawImage(image, (int) stringX, 50, null);
        g.draw3DRect(400, 200, 100, 200, true);
    }
}
