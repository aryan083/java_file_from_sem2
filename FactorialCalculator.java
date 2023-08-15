import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FactorialCalculator extends JFrame {
    private JTextField inputField;
    private JTextField outputField;
    private JButton computeButton;

    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel inputLabel = new JLabel("Enter an integer:");
        inputField = new JTextField(50);
        outputField = new JTextField(50);
        outputField.setEditable(false);
        computeButton = new JButton("Compute");

        computeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                computeFactorial();
            }
        });

        add(inputLabel);
        add(inputField);
        add(computeButton);
        add(outputField);

        pack();
        setVisible(true);
    }

    private void computeFactorial() {
        String input = inputField.getText();
        try {
            int number = Integer.parseInt(input);
            long factorial = calculateFactorial(number);
            outputField.setText(String.valueOf(factorial));
        } catch (NumberFormatException e) {
            outputField.setText("Invalid input");
        }
    }

    private long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FactorialCalculator();
            }
        });
    }
}
