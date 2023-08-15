class animals{
    int x=7;
     void eating (){
     System.out.println("Eating everything "+ x);}
     void sleeping(){
        System.out.println("Sleeping alone "+ x);}}
class kutta extends animals
{   void barking(){
    int y=70;
    System.out.println("int x"+x);
    System.out.println("int y = "+y);
    System.out.println("Barking");
    super.sleeping();
    super.eating();
    super.x=45;
 System.out.println("int x= "+x);} 
  void sleeping(){System.out.println("soja");}
kutta(){
    System.out.println("con");;
    int x=56;
    System.out.println(x);
    System.out.println(super.x);
}
}
public class callco {
    public static void main(String[] args) {
       animals a1=new animals();
       kutta k1=new kutta();
       //a1.eating();
       //a1.sleeping();
       k1.barking();
       kutta k2 = new kutta(); 
    
        }    
}
