interface a1{
    abstract void name();
    
}
interface a2{
    abstract void surname();

}
class a implements a1,a2{
    public void name(){
        System.out.println("Name:- ");
    }
    public void surname(){
        System.out.println("Surname:- ");
    }
}
public class LabassignmentQues3 {
 public static void main(String[] args) {
    a a12= new a();
    a12.name();
    a12.surname();
 }   
}
