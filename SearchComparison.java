import java.util.Arrays;
import java.util.Scanner;

public class SearchComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        // ---------------- LINEAR SEARCH ----------------
        int linearCount = 0;
        int linearPosition = -1;

        for (int i = 0; i < n; i++) {
            linearCount++;

            if (arr[i] == target) {
                linearPosition = i;
                break;
            }
        }

        if (linearPosition != -1) {
            System.out.println("\nLinear Search: Element found");
            System.out.println("Position: " + (linearPosition + 1));
            System.out.println("Numbers checked: " + linearCount);
        } else {
            System.out.println("\nLinear Search: Element not found");
            System.out.println("Numbers checked: " + linearCount);
        }


        // ---------------- BINARY SEARCH ----------------

        // Binary search requires sorted array
        Arrays.sort(arr);

        int low = 0;
        int high = n - 1;

        int binaryCount = 0;
        int binaryPosition = -1;

        while (low <= high) {

            binaryCount++;

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                binaryPosition = mid;
                break;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        if (binaryPosition != -1) {
            System.out.println("\nBinary Search: Element found");
            System.out.println("Sorted array: " + Arrays.toString(arr));
            System.out.println("Position in sorted array: " + (binaryPosition + 1));
            System.out.println("Numbers checked: " + binaryCount);
        } else {
            System.out.println("\nBinary Search: Element not found");
            System.out.println("Numbers checked: " + binaryCount);
        }

        sc.close();
    }
}