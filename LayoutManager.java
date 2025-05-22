import javax.swing.*;
import java.awt.*;

public class LayoutManager {

    public static void main(String[] args) {
        JFrame f = new JFrame("MY First GUI");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set BorderLayout as the layout manager
        f.setLayout(new BorderLayout());

        // Create buttons
        JButton b1 = new JButton("SOUTH");
        JButton b2 = new JButton("NORTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");

        // Add buttons to the frame with BorderLayout positions
        f.add(b1, BorderLayout.SOUTH);
        f.add(b2, BorderLayout.NORTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);

        // Make the frame visible
        f.setVisible(true);
    }
}