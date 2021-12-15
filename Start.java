package com.LTP.main;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Start {

    private JFrame window;

    public Start() {
        window = new JFrame("hueta");
        window.setSize(280, 350);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.add(new Panel());

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Start();
            }
        });
    }
}