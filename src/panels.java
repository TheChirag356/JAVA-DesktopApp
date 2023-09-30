import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class panels {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components

        ImageIcon icon = new ImageIcon("assets/thumbs-up.png");

        JLabel label = new JLabel();
        label.setText("Hi!");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250, 0, 250, 250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 250, 500, 250);
        greenpanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setVisible(true);
        redpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
//        frame.add(label);


    }
}
