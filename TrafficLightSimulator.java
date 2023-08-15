import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulator extends JFrame implements ActionListener {
    private JRadioButton redButton;
    private JRadioButton yellowButton;
    private JRadioButton greenButton;
    private JLabel messageLabel;

    public TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(50, 15));

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        messageLabel = new JLabel();
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));

        add(redButton);
        add(yellowButton);
        add(greenButton);
        add(messageLabel);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            messageLabel.setText("Stop");
            messageLabel.setForeground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            messageLabel.setText("Ready");
            messageLabel.setForeground(Color.YELLOW);
        } else if (e.getSource() == greenButton) {
            messageLabel.setText("Go");
            messageLabel.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TrafficLightSimulator();
            }
        });
    }
}
