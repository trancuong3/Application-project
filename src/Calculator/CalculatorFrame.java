package Calculator;

import java.awt.*;
import javax.swing.*;

public class CalculatorFrame extends JFrame {
    private JTextField resultField;
    private HistoryPanel historyPanel;

    public CalculatorFrame() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        // Nút đơn giản để test
        JButton btnAdd = new JButton("1 + 2");
        btnAdd.addActionListener(e -> {
            double a = 1;
            double b = 2;
            double result = a + b;
            resultField.setText(String.valueOf(result));
            updateHistory(a, b, "+", result);
        });
        buttonPanel.add(btnAdd);

        add(buttonPanel, BorderLayout.CENTER);

        historyPanel = new HistoryPanel();
        add(historyPanel, BorderLayout.EAST);

        setSize(500, 300);
        setLocationRelativeTo(null);
    }

    public void updateHistory(double num1, double num2, String op, double result) {
        historyPanel.addToHistory(num1, num2, op, result);
    }
}
