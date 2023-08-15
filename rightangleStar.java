import  java.util.*;
public class rightangleStar {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t,i,j;
    System.out.println("Enter the number of lines you want: -");
    t=sc.nextInt();
    for(i=0;i<t;i++){
        for(j=0;j<=i;j++){
            System.out.print(" * ");
        } 
        System.out.println();
    }
sc.close();
}
   
}
