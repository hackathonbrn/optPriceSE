package ru.hackathon.optPriceSearchEngine.windows;

import javax.swing.*;

public class MainForm {

    private JPanel panel;

    public static void show() {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
