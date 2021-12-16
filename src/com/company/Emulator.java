package com.company;
import javax.swing.*;

import javax.swing.*;
import java.awt.*;
class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("PV emulator V2.0");
        frame.pack();
        frame.setVisible(true);
    }
}
