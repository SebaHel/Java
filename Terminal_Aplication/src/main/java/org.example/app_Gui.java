package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class app_Gui {
    app_Gui() {

        JLabel Terminal = new JLabel("Terminal");
        Terminal.setForeground(Color.MAGENTA);
        Terminal.setHorizontalAlignment(JLabel.CENTER);
        Terminal.setPreferredSize(new Dimension(200, 40));
        Terminal.setFont(new Font("Ariel", Font.BOLD, 20));

        ArrayList<JButton> Buttons = new ArrayList<>();

        JButton admin_button = new JButton("Admin Board");
        JButton show_Planes = new JButton("Show_Planes");
        Buttons.add(show_Planes);
        Buttons.add(admin_button);

        for (int i = 0; i < Buttons.size(); i++) {
            Buttons.get(i).setBackground(Color.cyan);
            Buttons.get(i).setFont(new Font("Ariel", Font.BOLD, 20));
            Buttons.get(i).setPreferredSize(new Dimension(200, 40));
        }


        JPanel left_panel = new JPanel();
        left_panel.setBackground(Color.blue);
        left_panel.setLayout(new FlowLayout());
        left_panel.setSize(200, 800);
        left_panel.setVisible(true);
        left_panel.add(Terminal);
        left_panel.add(show_Planes);
        left_panel.add(admin_button);


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
