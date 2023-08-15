class set{
    int x,y;
    set(){}
    set(int x,int y)
    {
        this.x=1;
        this.y=2;    
        System.out.println(x+"\n"+y+"\n");
    }
    set(set s1)
    {    
        System.out.println();
    }
    public void display()
{System.out.println(x+"\n"+y+"\n");}
}

public class copy_constucer {
    public static void main(String[] args) {
     set s1=new set(1,2);
     set s2 = new set(3,4);
     s1.display();
     s2.display();
    }
}
