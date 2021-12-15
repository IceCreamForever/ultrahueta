package com.LTP.main;

import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel {

    public JButton[] numbers = new JButton[10];
    public Font font = new Font("SanSerif", Font.BOLD, 20);
    public JTextField output = new JTextField();
    public JButton backspace = new JButton("<");
    public JButton equ = new JButton("=");
    public JButton plus = new JButton("+");
    public JButton minus = new JButton("-");
    public JButton div = new JButton("/");
    public JButton multi = new JButton("X");

    public Panel() {
        setLayout((LayoutManager)null);
        setFocusable(true);
        grabFocus();

        backspace.setBounds(10, 250, 50, 50);
        backspace.setFont(font);
        add(backspace);

        equ.setBounds(130, 250, 50, 50);
        equ.setFont(font);
        add(equ);

        plus.setBounds(190, 250, 50, 50);
        plus.setFont(font);
        add(plus);

        minus.setBounds(190, 190, 50, 50);
        minus.setFont(font);
        add(minus);

        div.setBounds(190, 130, 50, 50);
        div.setFont(font);
        add(div);

        multi.setBounds(190, 70, 50, 50);
        multi.setFont(font);
        add(multi);

        numbers[0] = new JButton("0");
        numbers[0].setBounds(70, 250, 50, 50);
        numbers[0].setFont(font);
        add(numbers[0]);

        for(int x = 0; x < 3; ++x) {
            for(int y = 0; y < 3; ++y) {
                numbers[x * 3 + y + 1] = new JButton((x * 3 + y + 1) + "");
                numbers[x * 3 + y + 1].setBounds(x * 60 + 10, y * 60 + 70, 50, 50);
                numbers[x * 3 + y + 1].setFont(font);
                add(numbers[x * 3 + y + 1]);
            }
        }

        output.setBounds(10, 10, 230, 50);
        output.setFont(font);
        output.setEditable(false);
        add(output);

        ActionListener l = (e) -> {
            JButton b = (JButton)e.getSource();
            output.setText(output.getText() + b.getText());
        };

        for (JButton b : numbers){
            b.addActionListener(l);
        }

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char symbol = e.getKeyChar();
                if (!Character.isDigit(symbol))

                    return;
                output.setText(output.getText() + symbol);
                }

        });
    }
}