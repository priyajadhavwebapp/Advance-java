package swings;

import javax.swing.*;
import java.awt.event.*;

public class CountryButtonDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Button Event Demo");

        // Create Label
        JLabel label = new JLabel("Press a button");
        label.setBounds(150, 50, 200, 30);

        // Create Buttons
        JButton btnIndia = new JButton("India");
        btnIndia.setBounds(100, 120, 100, 40);

        JButton btnSrilanka = new JButton("Srilanka");
        btnSrilanka.setBounds(250, 120, 120, 40);

        // Add ActionListener using anonymous class
        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(btnIndia);
        frame.add(btnSrilanka);

        // Frame settings
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}