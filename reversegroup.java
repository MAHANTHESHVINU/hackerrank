import java.util.Scanner;

public class reversegroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 3) {
            int left = i;
            int right = Math.min(i + 2, n - 1);

            while (left < right) {
                rotate(arr, left, right);
                left++;
            }
        }

        System.out.println("After reversing in groups of 3:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotate(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int last = arr[end];
        for (int j = end; j > start; j--) {
            arr[j] = arr[j - 1];
        }
        arr[start] = last;
    }
}
