class Cube{
    Double width,heiht,depth;
Cube()
{
    System.out.println("Create a cube");
    width=10.0;
    heiht=10.0;
    depth=10.0;
    }
}
public class MyMain {
    public static void main(String[] args) {
        Cube c=new Cube();
        
        System.out.println(c.depth);
        System.out.println(c.heiht);
        System.out.println(c.width);
    }
}
