import javax.swing.*;
import java.awt.*;

public class JFrameExamples {
    public static void main(String[] args) {
        JFrame frame=new JFrame("GUI");
                JPanel panel=new JPanel();
                panel.setLayout(new FlowLayout());
                JLabel label=new JLabel("Enter your name:");
                JButton button=new JButton("Submit");
                button.setBackground(Color.BLUE);
                button.setText("Button");
                panel.add(label);
                panel.add(button);
                frame.add(panel);
                frame.setSize(200,300);
                frame.setLocation(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
    }

}
