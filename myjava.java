class Cube1{
    Double width,heiht,depth;
Cube1(double w, double h, double d)
{
    System.out.println("Create a cube");
    width= w;
    heiht= h;
    depth= d;
    }
}
class myjava {
    public static void main(String[] args) {
        Cube1 c=new Cube1(10.0,10.0,10.0);
        System.out.println(c.depth);
        System.out.println(c.heiht);
        System.out.println(c.width);
    }}
    