package com.company;

import javax.swing.*;

public class GUI extends JFrame{
    private JPanel jPanelMain;
    private JButton ButtonLeft;
    private JButton buttonCenter;
    private JButton buttonRigth;
    private JLabel jLabelTop;
    private JLabel jLabelBottom;

    public GUI(String title){
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(jPanelMain);
        this.pack();
        ButtonLeft.addActionListener(new ButtonClickListener ( jLabelTop,  jLabelBottom));
        buttonCenter.addActionListener(new ButtonClickListener(jLabelTop, jLabelBottom));
        buttonRigth.addActionListener(new ButtonClickListener(jLabelTop, jLabelBottom));

    }

    public static void main(String[] args){
        JFrame frame = new GUI("Java SWING Examples");
        frame.setVisible(true);
    }
}
