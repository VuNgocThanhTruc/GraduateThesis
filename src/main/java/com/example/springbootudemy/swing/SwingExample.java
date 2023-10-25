package com.example.springbootudemy.swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author DuyND
 * @name SwingExample.java
 * @date 06/08/2023
 */
public class SwingExample {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me!");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Trần Sơn Giang"));

        frame.add(button);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingExample::createAndShowGUI);
    }
}
