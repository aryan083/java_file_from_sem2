import java.util.Scanner;
public class LabAssignment6Q2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Rows you want in array: -");
    int rows = sc.nextInt();
    System.out.println("Enter the ammount of columns you want in array.");
    int columns=sc.nextInt();
    int[][] array1= new int [rows][columns];
    for (int i= 0;i<columns;i++){
        for (int j=0;j<rows;j++){
            System.out.println("Enter the elment array["+i+"]["+j+"]");
            array1[i][j]=sc.nextInt();
        }
    }
    
    
    for (int i= 0;i<rows;i++){
        for (int j=0;j<columns;j++){
            System.out.println("array["+i+"]["+j+"] :- "+array1[i][j]);
    }
}
sc.close();
}
}
