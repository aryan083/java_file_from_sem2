import java.awt.*;
class AWTasso{
    AWTasso(){
        Frame f= new Frame();
        Label l =new Label("Name:");
        Button b= new Button("Submit");
        b.getColorModel();
        TextField  t= new TextField();
        l.setBounds(20, 80, 80, 40);
        t.setBounds(20, 100,80 , 30);
        b.setBounds(100, 100, 80, 30);
        f.add(b);
        f.add(l);
        f.add(t);
        f.setSize(400,300);
        f.setTitle("NAME");
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        AWTasso a1= new AWTasso();
    }
}