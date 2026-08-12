import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Need at least 2 numbers to compute second largest values.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] oddPositionValues = extractPositionValues(arr, true);
        int[] evenPositionValues = extractPositionValues(arr, false);

        Integer secondLargestOdd = secondLargest(oddPositionValues);
        Integer secondLargestEven = secondLargest(evenPositionValues);

        if (secondLargestOdd == null || secondLargestEven == null) {
            System.out.println("Not enough values in odd or even positions to determine a second largest number.");
        } else {
            int sum = secondLargestOdd + secondLargestEven;
            System.out.println("Odd position values: " + Arrays.toString(oddPositionValues));
            System.out.println("Even position values: " + Arrays.toString(evenPositionValues));
            System.out.println("Second largest at odd positions: " + secondLargestOdd);
            System.out.println("Second largest at even positions: " + secondLargestEven);
            System.out.println("Sum = " + sum);
        }

        sc.close();
    }

    private static int[] extractPositionValues(int[] arr, boolean oddPositions) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i % 2 == 0) == oddPositions) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i % 2 == 0) == oddPositions) {
                result[index++] = arr[i];
            }
        }
        return result;
    }

    private static Integer secondLargest(int[] values) {
        if (values.length < 2) {
            return null;
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        boolean foundSecond = false;

        for (int value : values) {
            if (value > largest) {
                second = largest;
                largest = value;
                foundSecond = second != Integer.MIN_VALUE;
            } else if (value > second && value < largest) {
                second = value;
                foundSecond = true;
            }
        }

        return foundSecond ? second : null;
    }
}