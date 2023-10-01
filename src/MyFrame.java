import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame() {

        ImageIcon icon = new ImageIcon("assets/point.png");
        ImageIcon icon2 = new ImageIcon("assets/face.png");

        label = new JLabel();


        button = new JButton();
        button.setBounds(200, 100, 250, 100);
//        button.addActionListener(e -> System.out.println("Poo"));
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setHorizontalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Poo");
        button.setEnabled(false);
    }
}
