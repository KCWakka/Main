import javax.swing.*;

public class MainFrame implements Runnable{
    private GraphicsPanel panel;
    public MainFrame() {
        JFrame frame = new JFrame("Intro to Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLocation(300, 50);

        // create and add panel
        panel = new GraphicsPanel();
        frame.add(panel);

        //display frame
        frame.setVisible(true);

        // start thread, required for animation
        Thread thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        while (true) {
            panel.repaint();
        }
    }
}
