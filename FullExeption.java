import java.util.Scanner;

public class FullExeption extends Exception{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
            System.out.println(":Enter Number 1 ");
            int num1= sc.nextInt();
            System.out.println("Enter Number 2 ");
            int num2= sc.nextInt();
            int div= num1/num2;
            System.out.println("div: " + div);
        } catch(ArithmeticException e){
            System.out.println("Error"+e.getMessage());
        } catch (Exception e){
            System.out.println("ERROR"+e.getMessage());
        }
        finally{
            System.out.println("THIS BLOCK WILL ALWAYS RUN ");
            sc.close();
        }

    }
}
