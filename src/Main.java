import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
/*
        JFrame frame = new JFrame(); // creates a frame
        frame.setVisible(true); // sets visibility to true
        frame.setSize(420, 420); // sets the x-dimension and y-dimension of frame
        frame.setTitle("Desktop Application Tutorial"); // sets title of the frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized

        ImageIcon image = new ImageIcon("assets/logo.png");
        frame.setIconImage(image.getImage());

        frame.getContentPane().setBackground(Color.BLACK);
*/

//        MyFrame myframe = new MyFrame();

        ImageIcon imageicon = new ImageIcon("assets/logo.png");
        Image image = imageicon.getImage();
        Image newimg = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imageicon = new ImageIcon(newimg);

        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();// create a label
        label.setText("Bro, do you even code?"); // set text of label
        label.setIcon(imageicon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("Ubuntu", Font.PLAIN, 20));
        label.setIconTextGap(-10);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100, 100, 250, 250);




        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();



        


    }
}