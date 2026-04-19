package swings;

import javax.swing.*;
import java.awt.event.*;

public class ImageButtonDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Image Button Demo");

        // Create Label
        JLabel label = new JLabel("Press a button");
        label.setBounds(150, 50, 300, 30);

        // Load Images (make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create Buttons with images
        JButton btnClock = new JButton(clockIcon);
        btnClock.setBounds(100, 120, 120, 100);

        JButton btnHourGlass = new JButton(hourGlassIcon);
        btnHourGlass.setBounds(250, 120, 120, 100);

        // Add Action Listeners
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components
        frame.add(label);
        frame.add(btnClock);
        frame.add(btnHourGlass);

        // Frame settings
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}