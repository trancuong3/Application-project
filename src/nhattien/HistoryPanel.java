package nhattien;
//Lớp này quản lý lịch sử các phép tính và hiển thị chúng trong một JTextArea.

//java
//Sao chép
//Chỉnh sửa
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HistoryPanel extends JPanel {
    private JTextArea historyArea;
    private List<String> historyList;

    public HistoryPanel() {
        historyList = new ArrayList<>();
        setLayout(new BorderLayout());
        historyArea = new JTextArea(10, 30);
        historyArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(historyArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void addToHistory(double a, double b, String operation, double result) {
        String entry = a + " " + operation + " " + b + " = " + result;
        historyList.add(entry);
        updateHistory();
    }

    public void updateHistory() {
        historyArea.setText("");
        for (String entry : historyList) {
            historyArea.append(entry + "\n");
        }
    }

    public void showHistory() {
        updateHistory();
    }
}
