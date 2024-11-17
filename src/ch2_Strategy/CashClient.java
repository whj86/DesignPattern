package ch2_Strategy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CashClient extends JFrame {
    private CashContext cashContext = null;
    String selectedItem;
    String receiptProducts = "";
    double sum = 0.0;

    public CashClient() {
        setTitle("收銀系統");
        setSize(600, 640);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // 上
        JPanel up = new JPanel();
        up.setLayout(new GridLayout(3, 3));
        add(up);

        // 上(第一列)
        JLabel priceLabel = new JLabel("單價：");
        priceLabel.setHorizontalAlignment(JLabel.CENTER);
        up.add(priceLabel);
        JTextField priceField = new JTextField(10);
        priceField.setHorizontalAlignment(JTextField.RIGHT);
        up.add(priceField);
        JButton confirmBtn = new JButton("確定");
        up.add(confirmBtn);

        // 上(第二列)
        JLabel qtyLabel = new JLabel("數量：");
        qtyLabel.setHorizontalAlignment(JLabel.CENTER);
        up.add(qtyLabel);
        JTextField qtyField = new JTextField(10);
        up.add(qtyField);
        qtyField.setHorizontalAlignment(JTextField.RIGHT);
        JButton resetBtn = new JButton("重設");
        up.add(resetBtn);

        // 上(第三列)
        JLabel algoLabel = new JLabel("計算方式：");
        algoLabel.setHorizontalAlignment(JLabel.CENTER);
        up.add(algoLabel);
        String[] algos = {"", "正常收費", "打八折", "滿300折100"};
        JComboBox<String> algoComboBox = new JComboBox<>(algos);
        up.add(algoComboBox);

        // 中
        JPanel center = new JPanel();
        add(center);
        JTextArea receipt = new JTextArea();
        receipt.setPreferredSize(new Dimension(500, 300));
        center.add(receipt);

        // 下
        JPanel down = new JPanel();
        add(down);
        down.setLayout(new GridLayout(1, 3));
        JLabel sumLabel = new JLabel("總計：");
        sumLabel.setHorizontalAlignment(JLabel.CENTER);
        down.add(sumLabel);
        JLabel sumNum = new JLabel(String.valueOf(sum));
        sumNum.setFont(new Font("Arial", Font.BOLD, 50));
        sumNum.setHorizontalAlignment(JLabel.LEFT);
        down.add(sumNum);

        // 定義事件
        algoComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedItem = (String) algoComboBox.getSelectedItem();
                if (!selectedItem.equals("")) {
                    cashContext = new CashContext(selectedItem);
                }
            }
        });

        confirmBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cashContext == null) {
                    JOptionPane.showMessageDialog(getContentPane(), "請選擇計費方式");
                } else {
                    double price;
                    if (priceField.getText().equals("")) {
                        price = 0.0;
                    } else {
                        price = Double.parseDouble(priceField.getText());
                    }
                    double qty;
                    if (qtyField.getText().equals("")) {
                        qty = 0.0;
                    } else {
                        qty = Double.parseDouble(qtyField.getText());
                    }
                    double processedCash = cashContext.processedCash(price * qty);
                    receiptProducts += String.format("單價： %.2f，數量： %.2f，%s，合計：%.2f\n", price, qty, selectedItem, processedCash);
                    receipt.setText(receiptProducts);
                    sum += processedCash;
                    sumNum.setText(String.format("%.2f", sum));
                }
            }
        });

        resetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                priceField.setText("");
                qtyField.setText("");
                algoComboBox.setSelectedIndex(0);
                receiptProducts = "";
                receipt.setText("");
                sum = 0.0;
                sumNum.setText(String.format("%.2f", sum));
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CashClient();
    }
}
