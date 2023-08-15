import java.util.*;
public class eightbit_1_2_complement {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a 8-Bit Bianry number to find its 1's and 2's com");
      int EightBitbinary=sc.nextInt();
      int ones_complement= ~ EightBitbinary;
      int twos_complement=~EightBitbinary+1;
      System.out.println("1's complement of " + EightBitbinary + " = " + ones_complement);
      System.out.println("2's complement of "+ EightBitbinary + " = " + twos_complement );
      sc.close();
    }
}
