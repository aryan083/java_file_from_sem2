import  java.util.*;
public class downsideStar {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t,i,j;
    System.out.println("Enter the number of lines you want: -");//number of terns 
    t=sc.nextInt();
    for(i=t-1;i>=0;i--){// loop for rows
        for(j=0;j<=i;j++){//loop for columns
            System.out.print(" * ");// to print *.
        } 
        System.out.println();//End of line to go to new line  
    }
sc.close();
}
   
}
