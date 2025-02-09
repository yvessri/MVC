package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controller.SuitController;
import Model.Suit;
import Model.SuitDatabase;
import Model.SuitValidator;

public class SuitViewGUI extends JFrame {
    private JTextField suitIdField;
    private JButton checkButton;
    private JButton repairButton;
    private JTextArea resultArea;

    public SuitViewGUI() {
        setTitle("Superhero Suit Checker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Code of Suit:"));
        suitIdField = new JTextField(10);
        inputPanel.add(suitIdField);
        checkButton = new JButton("Check");
        inputPanel.add(checkButton);

        add(inputPanel, BorderLayout.NORTH);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);

        repairButton = new JButton("Repair");
        repairButton.setEnabled(false);
        repairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String suitId = suitIdField.getText();
                String result = SuitController.repairSuit(suitId);
                resultArea.setText(result);
                repairButton.setEnabled(false);
            }
        });

        add(repairButton, BorderLayout.SOUTH);

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String suitId = suitIdField.getText();
                Suit suit = SuitDatabase.findSuitById(suitId);
                if (suit != null) {
                    String result = SuitController.checkSuitGUI(suitId);
                    resultArea.setText(result);

                    if (SuitValidator.isValidSuit(suit)) {
                        repairButton.setEnabled(true);
                    } else {
                        repairButton.setEnabled(false);
                    }
                } else {
                    resultArea.setText("Suit not found!");
                    repairButton.setEnabled(false);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SuitViewGUI::new);
    }
}
