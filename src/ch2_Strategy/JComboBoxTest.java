package ch2_Strategy;

import javax.swing.*;
import java.awt.*;

public class JComboBoxTest extends JFrame {
    public JComboBoxTest() {
        super("下拉選單測試");
        setSize(800, 600);
        setLayout(new FlowLayout());

        String[] items = {"蘋果", "香蕉", "橘子", "葡萄"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.addActionListener(e -> {
           String item = (String) comboBox.getSelectedItem();
           JOptionPane.showMessageDialog(this, "你選了" + item);
        });

        add(comboBox);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JComboBoxTest();
    }
}
