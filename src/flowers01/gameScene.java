/**
 * This is a class of gameScene GUI form. It contains the code of the whole program for execution.
 *
 * @author Anuar Tenizbayev
 * @version March 11, 2023
 */
package flowers01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class gameScene extends JFrame {
    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button10;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button12;
    private JButton button14;
    private JButton button13;
    private JButton button9;
    private JButton button11;
    private JButton button15;
    private JButton button16;
    private JLabel labelSeeds;
    private JLabel labelCount;
    private JLabel weather;
    public int seedsNum = 8;
    public int addedNumber = 0;



    public gameScene() {
        // Assigning panel
        setContentPane(panel1);
        setTitle("Flowers"); // Giving title
        setSize(600, 600); // Giving size
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Close program when window closes
        setVisible(true); // Make JFrame visible
        labelCount.setText(String.valueOf(seedsNum)); // Display in Label the number of seeds



        // Creating timer to increase amount of seeds depending on time
        Timer time = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                seedsNum += addedNumber;
                labelCount.setText(String.valueOf(seedsNum));
                // System.out.println("15 seconds passed.");
            }
        };
        if (weather.getText().equals("Sun")){
            time.scheduleAtFixedRate(task, 0, 15000);
        }


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button1, labelCount, seedsNum);
                addedNumber += earning(button1, labelCount, addedNumber);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button2, labelCount, seedsNum);
                addedNumber += earning(button2, labelCount, addedNumber);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button3, labelCount, seedsNum);
                addedNumber += earning(button3, labelCount, addedNumber);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button4, labelCount, seedsNum);
                addedNumber += earning(button4, labelCount, addedNumber);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button5, labelCount, seedsNum);
                addedNumber += earning(button5, labelCount, addedNumber);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button6, labelCount, seedsNum);
                addedNumber += earning(button6, labelCount, addedNumber);
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button7, labelCount, seedsNum);
                addedNumber += earning(button7, labelCount, addedNumber);
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button8, labelCount, seedsNum);
                addedNumber += earning(button8, labelCount, addedNumber);
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button9, labelCount, seedsNum);
                addedNumber += earning(button9, labelCount, addedNumber);
            }
        });

        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button10, labelCount, seedsNum);
                addedNumber += earning(button10, labelCount, addedNumber);
            }
        });

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button11, labelCount, seedsNum);
                addedNumber += earning(button11, labelCount, addedNumber);
            }
        });

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button12, labelCount, seedsNum);
                addedNumber += earning(button12, labelCount, addedNumber);
            }
        });

        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button13, labelCount, seedsNum);
                addedNumber += earning(button13, labelCount, addedNumber);
            }
        });

        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button14, labelCount, seedsNum);
                addedNumber += earning(button14, labelCount, addedNumber);
            }
        });

        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button15, labelCount, seedsNum);
                addedNumber += earning(button15, labelCount, addedNumber);
            }
        });

        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seedsNum = purchase(button16, labelCount, seedsNum);
                addedNumber += earning(button16, labelCount, addedNumber);
            }
        });
    }


    /**
     * This function returns number of seeds after planting one of the flowers.
     * @param button gets the button (place of the flower) and changes its parameters.
     * @param label Label which displays number of seeds.
     * @param numOfSeeds number of seeds available to the player.
     * @return number of seeds after purchase.
     */
    public static int purchase(JButton button, JLabel label, int numOfSeeds){
        if (button.getText().equals("Cost: 1")){
            if (numOfSeeds > 0){
                button.setForeground(Color.YELLOW);
                numOfSeeds = numOfSeeds - 1;
                label.setText(String.valueOf(numOfSeeds));
                button.setText("Cost: 10");
            }
        } else if (button.getText().equals("Cost: 10")){
            if (numOfSeeds >= 10){
                button.setForeground(Color.GREEN);
                numOfSeeds = numOfSeeds - 10;
                label.setText(String.valueOf(numOfSeeds));
                button.setText("Cost: 100");
            }
        } else if (button.getText().equals("Cost: 100")){
            if (numOfSeeds >= 100){
                button.setForeground(Color.PINK);
                numOfSeeds = numOfSeeds - 100;
                label.setText(String.valueOf(numOfSeeds));
                button.setText("Cost: 1000");
            }
        } else if (button.getText().equals("Cost: 1000")){
            if (numOfSeeds >= 1000){
                button.setForeground(Color.ORANGE);
                numOfSeeds = numOfSeeds - 1000;
                label.setText(String.valueOf(numOfSeeds));
                button.setText("Cost: 10000");
            }
        }
        return numOfSeeds;

    }

    /**
     * This function returns number of incoming seeds from different flowers.
     * @param button gets the button (place of the flower) and changes its parameters.
     * @param label Label which displays number of seeds.
     * @param income number of seeds which player can get.
     * @return number of incoming seeds.
     */
    public static int earning(JButton button, JLabel label, int income){
        if (button.getForeground().equals(new Color(192,199,196))){
            income = 0;
        } else if (button.getForeground() == Color.YELLOW){
            income = 1;
        } else if (button.getForeground() == Color.GREEN){
            income = 2;
        } else if (button.getForeground() == Color.PINK){
            income = 3;
        } else if (button.getForeground() == Color.ORANGE){
            income = 5;
        }
        return income;

    }

}
