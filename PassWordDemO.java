import javax.swing.*;

public class PassWordDemO {
    public static void main(String[] args) {
        JFrame f =new JFrame("Enter The Password: -");
        JPasswordField Value = new JPasswordField();
        JLabel l1= new JLabel("Password:- ");
        l1.setBounds(20,  100, 80, 30);   
        Value.setBounds(100,100,100,100);
        JRadioButton r1=new JRadioButton("Male", null);
        JRadioButton r2=new JRadioButton("Female", null);
        r1.setBounds(500, 500, 1000, 300);
        r2.setBounds(575, 575,  1075, 375);
        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);
        f.add(Value);
        f.add(l1);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}
