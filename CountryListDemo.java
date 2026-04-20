package swings;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {


    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Country List");

        // Country list data
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);

        // Set bounds
        list.setBounds(50, 50, 200, 200);

        // Add selection listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selected = list.getSelectedValue();
                    System.out.println("Selected Country: " + selected);
                }
            }
        });

        // Add list inside scroll pane (better UI)
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