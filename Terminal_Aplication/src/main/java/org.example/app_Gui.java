package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class app_Gui {


    ArrayList<JButton> Buttons = new ArrayList<>();

    app_Gui() {

        JLabel Terminal = new JLabel("Terminal");
        Terminal.setForeground(Color.MAGENTA);
        Terminal.setHorizontalAlignment(JLabel.CENTER);
        Terminal.setPreferredSize(new Dimension(200, 40));
        Terminal.setFont(new Font("Ariel", Font.BOLD, 20));



        Buttons.add(new JButton("Show avaible"));
        Buttons.add(new JButton("Show unavaible"));
        Buttons.add(new JButton("Show Full"));
        Buttons.add(new JButton("Show NotFull"));
        Buttons.add(new JButton("Update"));


        for (int i = 0; i < Buttons.size(); i++) {
            Buttons.get(i).setBackground(Color.cyan);
            Buttons.get(i).setFont(new Font("Ariel", Font.BOLD, 20));
            Buttons.get(i).setPreferredSize(new Dimension(200, 40));
            Buttons.get(i).addActionListener(e -> System.out.println("poo"));
        }


        JPanel left_panel = new JPanel();
        left_panel.setBackground(Color.blue);
        left_panel.setLayout(new FlowLayout());
        left_panel.setSize(200, 800);
        left_panel.setVisible(true);
        left_panel.add(Terminal);
        for (int i = 0; i < Buttons.size(); i++) {
            left_panel.add(Buttons.get(i));
        }


        JPanel right_panel = new JPanel();
        right_panel.setBackground(Color.gray);
        right_panel.setSize(400, 800);
        right_panel.setVisible(true);


        JFrame frame = new JFrame("Airplane Terminal");
        frame.setSize(600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.add(left_panel);
        frame.add(right_panel);


    }
}
