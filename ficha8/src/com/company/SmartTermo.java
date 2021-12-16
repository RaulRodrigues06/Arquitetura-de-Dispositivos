package com.company;

import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SmartTermo extends JFrame{
    private boolean fahrenheit;
    private double desiredTemp;
    private double desiredHum;
    private JPanel jPanelMain;
    private JButton buttonMinusGrades;
    private JButton buttonPlusGrades;
    private JButton buttonMinusHum;
    private JButton buttonPlusHum;
    private JToggleButton buttonChangueGrades;
    private JLabel labelTempActual;
    private JLabel labelTempWanted;
    private JLabel labelHumidActual;
    private JLabel labelHumidWanted;
    private JTextArea textAreaChanges;
    private JLabel labelDate;
    private JLabel labelTemp;
    private JLabel labelTempW;

    private SmartTermo(String title) {
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(jPanelMain);


        this.desiredTemp=20;
        this.labelTempActual.setText(this.desiredTemp + "ºC");
        this.desiredHum=50;
        this.labelHumidActual.setText(this.desiredHum + "%");
        this.labelTemp.setText("Current Temperature");
        this.labelTempW.setText("Wanted Temperature");

        this.fahrenheit=true;


        buttonMinusGrades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desiredTemp-=0.5;
                labelTempWanted.setText(desiredTemp + "ºC");
            }
        });
        buttonPlusGrades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desiredTemp+=0.5;
                labelTempWanted.setText(desiredTemp + "ºC");
            }
        });
        buttonMinusHum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desiredHum-=0.5;
                labelHumidWanted.setText(desiredHum + "%");
            }
        });
        buttonPlusHum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desiredHum+=0.5;
                labelHumidWanted.setText(desiredHum + "%");
            }
        });

        buttonChangueGrades.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if(!fahrenheit){
                    buttonChangueGrades.setText("Fahrenheit");
                    double conversion = (desiredTemp * 1.8) + 32;
                    labelTempActual.setText(conversion + "ºF");
                    labelTempWanted.setText(conversion + "ºF");
                    fahrenheit = true;
                }else{
                    buttonChangueGrades.setText("Celcius");
                    labelTempActual.setText(desiredTemp+"ºC");
                    labelTempWanted.setText(desiredTemp+ "ºC");

                    fahrenheit = false;
                }
            }
        });
        //JLabel date
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String newDate = date.format(myFormatObj);
        labelDate.setText(newDate);
        this.pack();
    }


    public static void main(String[] args){
        JFrame frame = new SmartTermo("Java SWING Examples");
        frame.setVisible(true);
    }
}
