class Cube2{
    Double width,heiht,depth;
    Cube2()//non para
    {System.out.println("NON parmetreised \n\n");}
    Cube2(double w, double h, double d)
{// also with non para and para in 1 code
    System.out.println("Create a cube with parameters\n\n");
    width= w;
    heiht= h;
    depth= d;
    }
    double calVolume(){
        return width*heiht*depth;
    }
}
public class constructerwithrt {
    public static void main(String[] args) {
        double vol;
        Cube2 c1=new Cube2(10.0,10.0,10.0);
        Cube2 c2=new Cube2();
        vol=c1.calVolume();
        System.out.println("Volume "+ vol);
        double vol2= c2.calVolume();
        System.out.println(vol2);
    }}
    
