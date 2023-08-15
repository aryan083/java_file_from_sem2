class classs{
    int x;
    int y;
    public void display(int x,int y){
       int sum= x+y;
        System.out.println("sum form public: - " + sum);
    }
    private void displaybyprivate(int x){
        int sumby= x*x;
        System.out.println("square of a by Private method :- "+sumby);
       } 
} 

public class privateNpublicMethod {
    

    public static void main(String[] args) {
    int a=5;
    int b= 7;
    classs c1=new classs();
    c1.display(a, b);
    //c1.displaybyprivate(a);

}    
}
/* private methods private methods can't be acceced 
by other classes during run time other than method class  */
