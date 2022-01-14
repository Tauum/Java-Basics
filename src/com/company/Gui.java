package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {

    public int counter = 0;
    public JLabel label;
    public JFrame frame;
    public JPanel panel;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public boolean disable = false;
    public ImageIcon image;

    public static void main(String args[])
    {
        new Gui();
    }

    public Gui()
    {
        frame = new JFrame("Test Title");
        panel = new JPanel();
        image = new ImageIcon("download.png");
        frame.setIconImage(image.getImage()); //sets frame icon to image
        panel.setBorder(BorderFactory.createEmptyBorder(30,10,30,10));
        //panel.setLayout(new GridLayout(2,2));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 380);
        frame.getContentPane().setBackground(Color.gray); //this can be rgb or hex value for custom colours

        //frame.setMinimumSize(250, 250); //doesnt like double int but documentation shows it takes dimension which is int: https://docs.oracle.com/javase/7/docs/api/java/awt/Dimension.html
        //frame.pack(); //this makes it small but will fill contents

        button1 = new JButton("Increase"); //this can be added to frame or panel
        button1.addActionListener(this); // this points to the parent class and uses action listener method
        button1.setBackground(Color.green);

        button2 = new JButton("Decrease");
        button2.addActionListener(this);
        button2.setBackground(Color.orange);

        button3 = new JButton("Reset");
        button3.addActionListener(this);
        button3.setBackground(Color.red);
        //button3.addActionListener(e -> counter = 0;)); //can use lambda expressions to negate function decleration below

        button4 = new JButton("Disable ^");
        button4.addActionListener(this);

        label = new JLabel("Click to start");
        //frame.getContentPane().add(button); // Adds Button to content pane of frame

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        panel.add(label);
        frame.setVisible(true);
        panel.setLayout(null);

        button1.setBounds(20,100,100,100);
        button2.setBounds(20,225,100,100);

        button3.setBounds(275,100,100,100);
        button4.setBounds(275,225,100,100);

        label.setBounds(165,160,100,100);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==button1) { counter++; }
        else if (e.getSource()==button2) { counter--; }
        else if (e.getSource()==button3) { counter = 0; }
        else if (e.getSource()==button4)
        {
            if (disable == false)
            {
                disable = true;
                button4.setBackground(Color.CYAN);
                button4.setText("Reset false");
                button3.setEnabled(false);
            }
            else
            {
                disable = false;
                button4.setBackground(Color.pink);
                button4.setText("Reset true");
                button3.setEnabled(true);
            }
        }
        else{}
        label.setText("Clicks > " + counter);
    }

}