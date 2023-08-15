import javax.swing.*;
import java.awt.event.*;
public class PracticeOFSwing extends JFrame {
    PracticeOFSwing(){
       final JTextField tf= new JTextField();
       tf.setBounds(50, 50, 150, 90);
        JButton b= new JButton("Click kar le ");
        b.setBounds(75, 75, 100, 75);
        b.addActionListener(new ActionListener() {
            public void actionPerfromed(ActionEvent e) {
                tf.setText("Welcome to OOP Class.");
                
    }  });
        add(b);
        add(tf);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        
        PracticeOFSwing BD1= new PracticeOFSwing();
    }
}


