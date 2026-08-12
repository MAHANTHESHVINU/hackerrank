import java.util.Arrays;
import java.util.Scanner;

public class SearchDemo {
    static class Result {
        int index;
        int comparisons;
        Result(int index, int comparisons) {
            this.index = index;
            this.comparisons = comparisons;
        }
    }

    public static Result linearSearch(int[] arr, int target) {
        int cmp = 0;
        for (int i = 0; i < arr.length; i++) {
            cmp++;
            if (arr[i] == target) return new Result(i, cmp);
        }
        return new Result(-1, cmp);
    }

    public static Result binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        int cmp = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            cmp++;
            if (arr[mid] == target) return new Result(mid, cmp);
            if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return new Result(-1, cmp);
    }

    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62};
        System.out.println("Array: " + Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        Result lr = linearSearch(arr, target);

        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        Result br = binarySearch(sorted, target);

        System.out.println();
        System.out.println("Linear Search -> index=" + lr.index + ", comparisons=" + lr.comparisons);
        System.out.println("Sorted array used for Binary Search: " + Arrays.toString(sorted));
        System.out.println("Binary Search -> index(in sorted array)=" + br.index + ", comparisons=" + br.comparisons);

        sc.close();
    }
}
