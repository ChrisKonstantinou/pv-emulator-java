package com.company;
import javax.swing.*;

import javax.swing.*;
import java.awt.*;
class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("PV Emulator v2.0"); // Set the frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600); // Set the frame dimensions
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("logo/logo.jpg");
        frame.setIconImage(image.getImage());
    }
}
