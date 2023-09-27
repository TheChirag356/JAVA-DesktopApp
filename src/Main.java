import javax.swing.*;
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

        ImageIcon image = new ImageIcon("assets/logo.png");

        JLabel label = new JLabel();// create a label
        label.setText("Bro, do you even code?"); // set text of label
        label.setIcon(image);0
        label.setHorizontalTextPosition(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);



        


    }
}