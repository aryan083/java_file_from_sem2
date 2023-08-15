import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.*;
public class CheckBoxDemo {
    CheckBoxDemo(){
    JFrame f= new JFrame("Check Box Example Demo");   
    final JLabel lable = new JLabel();
    lable.setHorizontalAlignment(JLabel.CENTER);
    lable.setSize(400, 200);
    JCheckBox checkBox1= new JCheckBox("Pi");
    checkBox1.setBounds(150, 100, 50, 50);
    JCheckBox checkBox2= new JCheckBox("e"); 
    checkBox2.setBounds(150, 150, 50, 50);
    f.add(checkBox1);
    f.add(checkBox2);
    f.add(lable);
    checkBox1.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e){
            lable.setText("Pi Checkbox: "+(e.getStateChange()==1?"Checked":"Unchecked"));

        }
    });
    
    checkBox2.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e){
        lable.setText("e Checked: "+ (e.getStateChange()==1?"checked":"Unchecked"));
    }
    });
    f.setSize(500, 500);
    f.setLayout(null);
    f.setVisible(true);

}
    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}
