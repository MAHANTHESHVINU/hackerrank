import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class capgemini {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of array elements: ");
            int n = scanner.nextInt();
            
            if (n < 2) {
                System.out.println(-1);
                scanner.close();
                return;
            }
            
            int[] arr = new int[n];
            System.out.println("Enter " + n + " integer values:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            int result = computeResult(arr);
            System.out.println("Result: " + result);
        }
    }

    static int computeResult(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        Set<Integer> seen = new HashSet<>();
        for (int value : arr) {
            if (!seen.add(value)) {
                return 0;
            }
        }

        long sum = (long) arr[0] + arr[arr.length - 1];
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) sum;
    }
}
