import javax.swing.*;
public class ButtoNDemO extends JFrame {
    ButtoNDemO(){
        JButton b= new JButton("Click kar le ");
        b.setBounds(45, 70, 100, 50);
        add(b);
        setLayout(null);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        
        ButtoNDemO BD1= new ButtoNDemO();
    }
}
