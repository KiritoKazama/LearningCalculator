package calculator;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 * Created by Kirito on 14.08.2016.
 */
public class calc {
    JPanel windowContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;

    JPanel p1;

    // конструктор
    calc(){
        windowContent = new JPanel();
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);

        displayField = new JTextField(30);
        windowContent.add("North", displayField);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        // создаем панель грид

        p1 = new JPanel();
        GridLayout g1 = new GridLayout(4,3);
        p1.setLayout(g1);

        // добавляем кнопки на панель р1

        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        // панель р1 в центр

        windowContent.add("Center",p1);

        // создаем фрейм

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        // совершенный размер окна

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        calc kal = new calc();
    }

}
