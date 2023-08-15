import java.util.*;


class binary{
    int decimal_number;
    public void convertiontobinary(int decimal_number){ 
         String binary_number= Integer.toBinaryString(decimal_number);
         System.out.println("(" + decimal_number+")10"+" = "+"("+ binary_number +")2" );    }
}
class anynumbersystem{
    int decimal_number;
    int array[]=new int [15];
    int base;
    int array2[]=new int [15];
    public void decimalnumber_to_anynumbersystem(int decimal_number, int base){

        int i=0;
        
        while(decimal_number!=0)
        {
            
            array [i]= decimal_number%base;
            decimal_number=decimal_number/base;
            i++;
            
        }
       for (int j =i-1;j>=0;j--){
        System.out.print(array[j]);
       }
    }
}
public class decimaltoanynumber {
    public static void main(String[] args) {
   
    System.out.println("Enter the base of number system");    
    Scanner sc= new Scanner(System.in);
    int Number_system = sc.nextInt();
    System.out.println("Enter the number You want to convert in " +Number_system + " System");
    int number = sc.nextInt();
    binary b1= new binary();
    if(Number_system==2)
    {b1.convertiontobinary(number);}
    else {
        anynumbersystem a1=new anynumbersystem();
        a1.decimalnumber_to_anynumbersystem(number, Number_system);
    }
    

    sc.close();
    }
}
