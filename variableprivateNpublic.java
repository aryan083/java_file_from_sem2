class variablePrivate{
    private int x=5 ;
    public void display(){
        System.out.println("by private :-"+  x);
        
    }
}
class variablePubilc{
    public void displaybypublc(int x)  
    {System.out.println("Number by Public:- "+ x);
}}

public class variableprivateNpublic {
    public static void main(String[] args) {
        //int a;
    variablePrivate p1=new variablePrivate();
    variablePubilc p2= new variablePubilc();
    p1.display();
    p2.displaybypublc(5);
    
    }
}
// can be acceced by only by variable classes comented line genretes error