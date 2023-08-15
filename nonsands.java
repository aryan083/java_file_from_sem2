class none{
    static int a=40;
    static int b=50;

    static int dispaly(){
        System.out.println("Static meathod written here");
        return a+b;
    }

}
class none2{
 float x=10;
 float y=20;
 public float dispaly(){
    return x+y; 
}

}
public class nonsands {
    public static void main(String[] args) {
    none n1=new none();
      int d=n1.dispaly();    
     none2 n2=new none2();
     float z=  n2.dispaly();
    System.out.println("A+B = "+d + "X+Y = "+ z );
    }
}
