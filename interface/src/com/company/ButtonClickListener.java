package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    private JLabel jlabelTop;
    private JLabel jlabelBottom;

    public ButtonClickListener(JLabel jLabelTop, JLabel jLabelBottom){
        this.jlabelTop=jLabelTop;
        this.jlabelBottom=jLabelBottom;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("OK")){
            jlabelBottom.setText("Ok button clicked");
        }else if(command.equals("Submit")){
            jlabelBottom.setText("Submit button clicked");
        }else {
            jlabelBottom.setText("Cancel button clicked");
        }
    }
}
