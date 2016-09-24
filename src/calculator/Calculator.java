package calculator;
import javax.swing.*;
import java.awt.FlowLayout;

/**
 * Created by Kirito on 14.08.2016.
 */
public class Calculator {
    public static void main(String[] args){
        // создание панели
        JPanel windowContent = new JPanel();

        // менеджер отображения
        FlowLayout F1 = new FlowLayout();

        windowContent.setLayout(F1);

        // создаем компоненты в памяти
        JLabel label1 = new JLabel("Число А");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Число В");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Итог");
        JTextField field3 = new JTextField(10);

        JButton go = new JButton("Нажать");

        // добовляем компоненты на панель
        // правильный порядок
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(field3);
        windowContent.add(go);

        // создание фрейма и создание для него панели
        JFrame frame = new JFrame("Первый калькулятор");
        frame.setContentPane(windowContent);

        // устанавливаем размер и включаем видимость

        frame.setSize(375,100);
        frame.setVisible(true);

    }
}
