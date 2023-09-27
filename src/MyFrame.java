import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setVisible(true); // sets visibility to true
        this.setSize(420, 420); // sets the x-dimension and y-dimension of this
        this.setTitle("Desktop Application Tutorial"); // sets title of the this
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevent this from being resized

        ImageIcon image = new ImageIcon("assets/logo.png");
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(Color.BLACK);
    }
}
