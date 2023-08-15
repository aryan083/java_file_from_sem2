import java.util.Scanner;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class customException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Number 1: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter Number 2: ");
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new MyCustomException("Divisor cannot be zero");
            }

            int div = num1 / num2;
            System.out.println("div: " + div);
        } catch (MyCustomException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("THIS BLOCK WILL ALWAYS RUN");
            scanner.close();
        }
    }
}
