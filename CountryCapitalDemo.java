package swings;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Country Capitals");

        // Country list
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);

        // Capitals mapping
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "No single capital"); // continent
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Add listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selected = list.getSelectedValue();
                    String capital = capitals.get(selected);
                    System.out.println("Country: " + selected + " -> Capital: " + capital);
                }
            }
        });

        // Scroll pane
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(50, 50, 200, 200);

        // Add to frame
        frame.add(scrollPane);

        // Frame settings
        frame.setSize(350, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}