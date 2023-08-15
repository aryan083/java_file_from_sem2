abstract class Car{
	public abstract double getAvg();}
class Swift extends Car{
public  double  getAvg(){
return 69.0;}
}
class Baleno extends Car{
public  double getAvg(){
return 42.0;}
}
public class myabstractdemo{
public static void main (String[] args){
Swift s= new Swift();
Baleno b= new Baleno();
System.out.println(s.getAvg());
System.out.println(b.getAvg());

}}