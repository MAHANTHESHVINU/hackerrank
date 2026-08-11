import java.util.Scanner;

public class st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;

        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        int lastDigit = num % 10;
        int sum = firstDigit + lastDigit;

        int reverse = 0;
        int temp = num;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
        System.out.println("Sum of first and last digit: " + sum);

        if (original == reverse) {
            System.out.println("This number is a palindrome.");
        } else {
            System.out.println("This number is not a palindrome.");
        }

        sc.close();
    }
}
