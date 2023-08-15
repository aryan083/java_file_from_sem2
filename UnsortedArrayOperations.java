import java.util.Scanner;

public class UnsortedArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            int operations = findMinimumOperations(arr);
            System.out.println(operations);
        }
        
        scanner.close();
    }
    
    private static int findMinimumOperations(int[] arr) {
        int n = arr.length;
        int unsortedPosition = -1;
        
        // Find the position where the array becomes unsorted
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                unsortedPosition = i;
                break;
            }
        }
        
        if (unsortedPosition == -1) {
            // Array is already sorted
            return 0;
        }
        
        // Calculate the number of operations needed for both cases (increment or decrement)
        int incrementOperations = arr[0];
        int decrementOperations = 0;
        for (int i = 1; i <= unsortedPosition; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff >= 0) {
                incrementOperations += diff + 1;
            } else {
                decrementOperations -= diff - 1;
            }
        }
        
        // Choose the minimum number of operations needed
        return Math.min(incrementOperations, decrementOperations);
    }
}
