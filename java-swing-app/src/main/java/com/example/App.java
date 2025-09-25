package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        // Create the window
        JFrame frame = new JFrame("HelloSwing");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 1)); // 2 rows, 1 column

        // Create the label
        JLabel label = new JLabel("Hello World", JLabel.CENTER);

        // Create the button
        JButton button = new JButton("Press Me");

        // Add button behavior
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You did it!");
            }
        });

        // Add components to the window
        frame.add(label);
        frame.add(button);

        // Show the window
        frame.setVisible(true);
    }
}