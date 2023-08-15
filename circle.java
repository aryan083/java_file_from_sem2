// Write down a java program to create a class called Circle and construct
// three object of class Circle with radius 10,5,15 and displays the area of
// Circle for each of the radius.
class arofcl{
    int r;
    double pi= 3.14;
    
    arofcl()
    { this.r=10;
      
    }
    arofcl(int r){
        this.r = r;
     
    }
    arofcl(int r,double pi)
{
    this.r =r;
    this.pi= pi;
}
public double area(){
    double area= r*r*pi;
    return area;
}    
}
public class circle {
    public static void main(String[] args) {
    arofcl c1= new arofcl();
    arofcl c2= new arofcl(5);
    arofcl c3= new arofcl(15,3.14);
    System.out.println("Circle 1 " +c1.area() );
    System.out.println("circle 2 "+ c2.area());
    System.out.println("Circle 3 "+ c3.area());
    


}
}