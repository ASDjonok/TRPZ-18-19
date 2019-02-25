package graphical;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(300, 300);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation((int)screenSize.getWidth()/2, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*JLabel jLabel = new JLabel("Hello World!");
        jFrame.add(jLabel);
        jFrame.setLayout(null);
        jLabel.setSize(100, 20);
        jLabel.setLocation(100, 20);
        jLabel.setForeground(Color.RED);*/
//        jFrame.add(jLabel, BorderLayout.CENTER);
//        jFrame.add(new JLabel("TEST"), BorderLayout.WEST);

        jFrame.setLayout(null);
        JLabel jLabel = new JLabel("My Super Label");
        jLabel.setLocation(10, 10);
        jLabel.setSize(100, 20);
        jFrame.add(jLabel);

        JTextField jTextField = new JTextField();
        jTextField.setSize(160, 40);
        jTextField.setLocation(30, 80);
        jFrame.add(jTextField);

        JButton jButton = new JButton("Push Me!");
        jButton.setSize(160, 40);
        jButton.setLocation(30, 40);
        jFrame.add(jButton);
        jButton.addActionListener(e -> jLabel.setText(jTextField.getText()));

        System.out.println(screenSize);
        System.out.println("Done!");

    }
}
