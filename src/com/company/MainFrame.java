package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener
{
    JButton button;

    MainFrame()
    {
        button = new JButton();
        button.setBounds(400, 200, 100, 50);
        button.addActionListener(this);

        this.setTitle("PV Emulator v2.0"); // Set the frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600); // Set the frame dimensions
        this.setVisible(true);
        this.setLayout(null);

        ImageIcon image = new ImageIcon("logo/logo.jpg");
        this.setIconImage(image.getImage());
        this.add(button);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button)
        {
            System.out.println("Button pressed");
        }
    }
}

/*
JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("PV Emulator v2.0"); // Set the frame title
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600); // Set the frame dimensions
                frame.setVisible(true);

                ImageIcon image = new ImageIcon("logo/logo.jpg");
                frame.setIconImage(image.getImage());


*/